package unifacef.edu.primevideo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import unifacef.edu.primevideo.model.dto.FilmeDTO;
import unifacef.edu.primevideo.model.entity.FilmeEntity;
import unifacef.edu.primevideo.model.repository.FilmeRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class FilmeService {
    // injeção de dependência
    @Autowired
    FilmeRepository injecao;
    @Autowired
    ConverserService conversor;
    public FilmeDTO insere(FilmeDTO filmeDTO){
        // convertemos FilmeDTO em FilmeEntity para enviar ao BD
        // o método está sendo chamado sem necessidade de instanciar um objeto
        // convertemos FilmeEntity em FilmeDTO para enviar ao frontend
        FilmeEntity entidade = conversor.converteFilmeDTO(filmeDTO);
         FilmeEntity resposta = injecao.save(entidade); // entidade não tem id
        return conversor.converteFilmeEntity(resposta);

    }
    // retorna todos os filmes - lista de filmes
    public List<FilmeDTO> consultaTodos(){
        List<FilmeEntity> filmes = injecao.findAll();
        return filmes.stream().map(conversor::converteFilmeEntity).collect(Collectors.toList());
    }
    // retorn um filme em específico, filtrado por id
    public FilmeDTO consultaPorId(Long id){
        // retorna um valor opcional, pois pode encontrar ou não
        Optional<FilmeEntity> optional = injecao.findById(id);
        if (optional.isPresent()){ // caso encontrou
            return conversor.converteFilmeEntity(optional.get()); // converte Entity em DTO
        }
        else return null; // não encontrou
    }
    // remove um filme por id
    public String remove(Long id){
        if (injecao.existsById(id)){
            injecao.deleteById(id);
            return "Remoção com sucesso";
        }
        else {
            return "Filme não encontrado";
        }
    }

    public List<FilmeDTO> atualizaNota10(){
        List<FilmeEntity> filmes = injecao.findAll();
        for(FilmeEntity filme: filmes){
            filme.setNota(10);
            injecao.save(filme); // filme tem o id, e ele existe no banco - update
        }
        return filmes.stream().map(conversor::converteFilmeEntity).collect(Collectors.toList());
    }

    public FilmeDTO atualizaId(Long id, FilmeDTO filmeDTO){
            if (injecao.existsById(id)) { // verifica se o filme existe
                filmeDTO.setId(id); // defino o id do objeto para alterar
                // 1o. converte filmeDTO em filmeEntity
                // 2o. atualiza filmeEntity no BD
                // 3o. converte filmeEntity em filmeDTO e retorno
                return conversor.converteFilmeEntity(injecao.save(conversor.converteFilmeDTO(filmeDTO)));
            }
            else {
                return null; // filme não existe
            }
    }
    // converte uma lista de FilmeEntity em uma lista de FilmeDTO



}
