package unifacef.edu.primevideo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import unifacef.edu.primevideo.model.dto.FilmeDTO;
import unifacef.edu.primevideo.model.entity.FilmeEntity;
import unifacef.edu.primevideo.model.repository.FilmeRepository;

@Service
public class FilmeService {
    // injeção de dependência
    @Autowired
    FilmeRepository injecao;
    public FilmeDTO insere(FilmeDTO filmeDTO){
        // o método está sendo chamado sem necessidade de instanciar um objeto
        injecao.save();
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