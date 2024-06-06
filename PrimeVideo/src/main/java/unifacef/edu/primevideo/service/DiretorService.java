package unifacef.edu.primevideo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import unifacef.edu.primevideo.model.dto.DiretorDTO;
import unifacef.edu.primevideo.model.entity.DiretorEntity;
import unifacef.edu.primevideo.model.repository.DiretorRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class DiretorService {
    @Autowired
    DiretorRepository injecaoDiretor;
    @Autowired
    ConversorService injecaoConversor;

    public DiretorDTO insere(DiretorDTO diretorDTO){
        DiretorEntity diretorEntity = injecaoConversor.converteDiretorDTO(diretorDTO);
        diretorEntity = injecaoDiretor.save(diretorEntity);
        return injecaoConversor.converteDiretorEntity(diretorEntity);
    }

    public List<DiretorDTO> consultaTodos(){
        // faz a consulta e recebo uma lista de DiretorEntity
        List<DiretorEntity> todos = injecaoDiretor.findAll();
        return todos.stream().map(injecaoConversor::converteDiretorEntity).collect(Collectors.toList());
    }

    public DiretorDTO consultaPorId(Long id){
        // retorna um diretor
        Optional<DiretorEntity> optional = injecaoDiretor.findById(id);
        if (optional.isPresent()) { // tem um diretor com este id
            return injecaoConversor.converteDiretorEntity(optional.get());
        }
        return null; // diretor não encontrado
    }

    public String remove(Long id){
        // retorna se removeu ou não
        if (injecaoDiretor.existsById(id)){ // verifica se o diretor existe
            injecaoDiretor.deleteById(id);
            return "Remoção realizada com sucesso";
        }
        return "Nenhum diretor foi removido";
    }

    public DiretorDTO atualizaPorId(Long id, DiretorDTO diretor){
        if (injecaoDiretor.existsById(id)){
            diretor.setId(id); // adiciona o id no diretor que será atualizado
            // converte DTO em Entity
            DiretorEntity diretorEntity = injecaoConversor.converteDiretorDTO(diretor);
            // vai atualizar, pois tem um id que existe no BD
            return injecaoConversor.converteDiretorEntity(injecaoDiretor.save(diretorEntity));
        }
        else return null;
    }

    public List<DiretorDTO> nomeSpielberg(){
        List<DiretorEntity> diretores = injecaoDiretor.findAll();
        for(DiretorEntity diretor: diretores){
            diretor.setNome("Spielberg"); // altera a nota
        }
        // salva no banco o vetor alterado
        List<DiretorEntity> diretoresEntity = injecaoDiretor.saveAll(diretores);
        return diretoresEntity.stream().map(injecaoConversor::converteDiretorEntity).collect(Collectors.toList()); // converte para DTO e retorna
    }
}
