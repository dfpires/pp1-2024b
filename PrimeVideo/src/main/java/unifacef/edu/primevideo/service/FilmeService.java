package unifacef.edu.primevideo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import unifacef.edu.primevideo.model.dto.FilmeDTO;
import unifacef.edu.primevideo.model.entity.FilmeEntity;
import unifacef.edu.primevideo.model.repository.FilmeRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class FilmeService {
    // injeção de dependência
    @Autowired
    FilmeRepository injecao;
    public FilmeDTO insere(FilmeDTO filmeDTO){
        // convertemos FilmeDTO em FilmeEntity para enviar ao BD
        // o método está sendo chamado sem necessidade de instanciar um objeto
        // convertemos FilmeEntity em FilmeDTO para enviar ao frontend
        FilmeEntity entidade = converteDTO(filmeDTO);
         FilmeEntity resposta = injecao.save(entidade);
        return converteEntity(resposta);

    }
    // retorna todos os filmes - lista de filmes
    public List<FilmeDTO> consultaTodos(){
        return converteEntities(injecao.findAll());
    }
    // retorn um filme em específico, filtrado por id
    public FilmeDTO consultaPorId(Long id){
        // retorna um valor opcional, pois pode encontrar ou não
        Optional<FilmeEntity> optional = injecao.findById(id);
        if (optional.isPresent()){ // caso encontrou
            return converteEntity(optional.get()); // converte Entity em DTO
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

    // converte uma lista de FilmeEntity em uma lista de FilmeDTO
    public List<FilmeDTO> converteEntities(List<FilmeEntity> filmesEntities){
            // cria uma lista de FilmeDTO
            List<FilmeDTO> filmesDTOs = new ArrayList<FilmeDTO>();

            // percorre filmesEntities
            for(FilmeEntity filmeEntity: filmesEntities){
                filmesDTOs.add(converteEntity(filmeEntity));
            }
            return filmesDTOs;
    }

    // converte FilmeDTO em FilmeEntity
    public FilmeEntity converteDTO(FilmeDTO filmeDTO){
        return new FilmeEntity(filmeDTO.getId(), filmeDTO.getNome(),
                filmeDTO.getAnoLancamento(), filmeDTO.getNota());
    }
    // converte FilmeEntity em FilmeDTO
    public FilmeDTO converteEntity(FilmeEntity filmeEntity){
        return new FilmeDTO(filmeEntity.getId(), filmeEntity.getNome(),
                filmeEntity.getAnoLancamento(), filmeEntity.getNota());
    }
}
