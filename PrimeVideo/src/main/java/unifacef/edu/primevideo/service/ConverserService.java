package unifacef.edu.primevideo.service;

import org.springframework.stereotype.Service;
import unifacef.edu.primevideo.model.dto.FilmeDTO;
import unifacef.edu.primevideo.model.entity.FilmeEntity;

@Service
public class ConverserService {
    // converte FilmeDTO em FilmeEntity
    public FilmeEntity converteFilmeDTO(FilmeDTO filmeDTO){
        if (filmeDTO == null){
            return null;
        }
        FilmeEntity aux =  new FilmeEntity();
        aux.setId(filmeDTO.getId());
        aux.setNome(filmeDTO.getNome());
        aux.setAnoLancamento(filmeDTO.getAnoLancamento());
        aux.setNota(filmeDTO.getNota());
        return aux;
    }
    // converte FilmeEntity em FilmeDTO
    public FilmeDTO converteFilmeEntity(FilmeEntity filmeEntity){
        if (filmeEntity == null){
            return null;
        }
        FilmeDTO aux =  new FilmeDTO();

        aux.setId(filmeEntity.getId());
        aux.setNome(filmeEntity.getNome());
        aux.setAnoLancamento(filmeEntity.getAnoLancamento());
        aux.setNota(filmeEntity.getNota());
        return aux;
    }
}
