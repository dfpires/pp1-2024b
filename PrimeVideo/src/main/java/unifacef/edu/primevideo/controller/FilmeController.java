package unifacef.edu.primevideo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import unifacef.edu.primevideo.model.dto.FilmeDTO;
import unifacef.edu.primevideo.service.FilmeService;

import java.util.List;

@RestController
@RequestMapping("/filme")
public class FilmeController {

    // injeção de dependência
    @Autowired
    FilmeService injecao;

    @PostMapping
    public FilmeDTO inserir(@RequestBody FilmeDTO filmeDTO){
        return injecao.insere(filmeDTO);
    }

    @GetMapping
    public List<FilmeDTO> consultaTodos(){
        return injecao.consultaTodos();
    }

    @GetMapping("/{id}")
    public FilmeDTO consultaPorId(@PathVariable Long id){
        return injecao.consultaPorId(id);
    }

    @DeleteMapping("/{id}")
    public String remove(@PathVariable Long id){
        return injecao.remove(id);
    }

    @PutMapping
    public List<FilmeDTO> atualizaNota10(){
        return injecao.atualizaNota10();
    }

    @PatchMapping("/{id}")
    public FilmeDTO atualizaId(@PathVariable Long id, @RequestBody FilmeDTO filmeDTO){
        return injecao.atualizaId(id, filmeDTO);
    }
}
