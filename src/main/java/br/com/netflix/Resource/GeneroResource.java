package br.com.netflix.Resource;

import br.com.netflix.Service.GeneroService;
import br.com.netflix.model.Genero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/genero")
public class GeneroResource {
    @Autowired
    private GeneroService service;
    @PostMapping
    public Genero salva (@RequestBody Genero genero){
        return service.salvar(genero);

    }
}
