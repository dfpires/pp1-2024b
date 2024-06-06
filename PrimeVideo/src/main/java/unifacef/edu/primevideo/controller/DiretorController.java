package unifacef.edu.primevideo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import unifacef.edu.primevideo.model.dto.DiretorDTO;
import unifacef.edu.primevideo.service.DiretorService;


import java.util.List;
@RestController
@RequestMapping("/diretor")
public class DiretorController {
    // injeção de dependência
    @Autowired
    DiretorService injecaoDiretor;

    @PostMapping
    public DiretorDTO insere(@RequestBody DiretorDTO diretor){
        return injecaoDiretor.insere(diretor);
    }

    @GetMapping
    public List<DiretorDTO> consultaTodos(){

        return injecaoDiretor.consultaTodos();
    }

    @GetMapping("/{id}")
    public DiretorDTO consultaPorId(@PathVariable Long id){

        return injecaoDiretor.consultaPorId(id);
    }

    @DeleteMapping("/{id}")
    public String remove(@PathVariable Long id){
        return injecaoDiretor.remove(id);
    }

    @PutMapping
    public List<DiretorDTO> nomeSpielberg(){
        return injecaoDiretor.nomeSpielberg();
    }

    @PatchMapping("/{id}")
    public DiretorDTO atualizaPorId(@PathVariable Long id, @RequestBody DiretorDTO diretor){
        return injecaoDiretor.atualizaPorId(id, diretor);
    }
}
