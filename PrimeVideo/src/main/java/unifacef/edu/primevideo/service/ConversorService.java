package unifacef.edu.primevideo.service;

import org.springframework.stereotype.Service;
import unifacef.edu.primevideo.model.dto.DiretorDTO;
import unifacef.edu.primevideo.model.dto.FilmeDTO;
import unifacef.edu.primevideo.model.entity.DiretorEntity;
import unifacef.edu.primevideo.model.entity.FilmeEntity;

@Service
public class ConversorService {
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
        aux.setDiretor(converteDiretorDTO(filmeDTO.getDiretor()));
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
        aux.setDiretor(converteDiretorEntity(filmeEntity.getDiretor()));
        return aux;
    }
    public DiretorDTO converteDiretorEntity(DiretorEntity diretorEntity){
        if (diretorEntity == null){
            return null;
        }
        DiretorDTO aux = new DiretorDTO();
        aux.setId(diretorEntity.getId());
        aux.setNome(diretorEntity.getNome());
        return aux;
    }
    public DiretorEntity converteDiretorDTO(DiretorDTO diretorDTO){
        if (diretorDTO == null){
            return null;
        }
        DiretorEntity aux = new DiretorEntity();
        aux.setId(diretorDTO.getId());
        aux.setNome(diretorDTO.getNome());
        return aux;
    }
}
