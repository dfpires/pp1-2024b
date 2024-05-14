package unifacef.edu.primevideo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import unifacef.edu.primevideo.model.dto.FilmeDTO;
import unifacef.edu.primevideo.service.FilmeService;

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
}
