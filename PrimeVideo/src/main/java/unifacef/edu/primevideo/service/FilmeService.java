package unifacef.edu.primevideo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import unifacef.edu.primevideo.model.dto.FilmeDTO;
import unifacef.edu.primevideo.model.entity.DiretorEntity;
import unifacef.edu.primevideo.model.entity.FilmeEntity;
import unifacef.edu.primevideo.model.repository.DiretorRepository;
import unifacef.edu.primevideo.model.repository.FilmeRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class FilmeService {
    // injeção de dependência
    @Autowired
    FilmeRepository injecaoFilme;
    @Autowired
    DiretorRepository injecaoDiretor;
    @Autowired
    ConversorService conversor;
    public FilmeDTO insere(FilmeDTO filmeDTO){
        // convert DiretorDTO to DiretorEntity and save it
        DiretorEntity diretorEntity = conversor.converteDiretorDTO(filmeDTO.getDiretor());
        diretorEntity = injecaoDiretor.save(diretorEntity);

        // convert FilmeDTO to FilmeEntity
        FilmeEntity auxEntity = conversor.converteFilmeDTO(filmeDTO);
        // set the saved DiretorEntity to the FilmeEntity
        auxEntity.setDiretor(diretorEntity);
        System.out.println(auxEntity.toString());
        // save the FilmeEntity
        FilmeEntity novoEntity = injecaoFilme.save(auxEntity);

        // convert to DTO and return
        return conversor.converteFilmeEntity(novoEntity);

    }
    // retorna todos os filmes - lista de filmes
    public List<FilmeDTO> consultaTodos(){
        List<FilmeEntity> filmes = injecaoFilme.findAll();
        return filmes.stream().map(conversor::converteFilmeEntity).collect(Collectors.toList());
    }
    // retorn um filme em específico, filtrado por id
    public FilmeDTO consultaPorId(Long id){
        // retorna um valor opcional, pois pode encontrar ou não
        Optional<FilmeEntity> optional = injecaoFilme.findById(id);
        if (optional.isPresent()){ // caso encontrou
            return conversor.converteFilmeEntity(optional.get()); // converte Entity em DTO
        }
        else return null; // não encontrou
    }
    // remove um filme por id
    public String remove(Long id){
        if (injecaoFilme.existsById(id)){
            injecaoFilme.deleteById(id);
            return "Remoção com sucesso";
        }
        else {
            return "Filme não encontrado";
        }
    }

    public List<FilmeDTO> atualizaNota10(){
        List<FilmeEntity> filmes = injecaoFilme.findAll();
        for(FilmeEntity filme: filmes){
            filme.setNota(10);
            injecaoFilme.save(filme); // filme tem o id, e ele existe no banco - update
        }
        return filmes.stream().map(conversor::converteFilmeEntity).collect(Collectors.toList());
    }

    public FilmeDTO atualizaId(Long id, FilmeDTO filmeDTO){
            if (injecaoFilme.existsById(id)) { // verifica se o filme existe
                filmeDTO.setId(id); // defino o id do objeto para alterar
                // 1o. converte filmeDTO em filmeEntity
                // 2o. atualiza filmeEntity no BD
                // 3o. converte filmeEntity em filmeDTO e retorno
                return conversor.converteFilmeEntity(injecaoFilme.save(conversor.converteFilmeDTO(filmeDTO)));
            }
            else {
                return null; // filme não existe
            }
    }
    // converte uma lista de FilmeEntity em uma lista de FilmeDTO



}
