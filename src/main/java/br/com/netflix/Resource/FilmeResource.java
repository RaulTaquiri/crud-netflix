package br.com.netflix.Resource;

import br.com.netflix.Service.FilmeService;
import br.com.netflix.model.Filme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/filme")
public class FilmeResource {

    @Autowired
    private FilmeService service;

    @GetMapping("/teste")
    public Filme teste(){
        Filme f = new Filme();
        f.setTitulo("Jurassic Park");
        return f;
    }

    @PostMapping
    public Filme salvar(@RequestBody Filme filme){
        filme = service.salvar(filme);
        return filme;
    }

    //PUT localhost:8080/filme
    /*
      {
        "id": 3,
        "titulo": "Alterando Filme"
      }
     */

    @PostMapping
    public Filme atualizar(@RequestBody Filme filme) throws Exception {
        return service.atualizar(filme);
    }
    @DeleteMapping
    public String remover(){
        return "Removendo";
    }

    @PutMapping
    public String atualizar(){
        return "Atualizou";
    }

    @GetMapping
    public String listar(){
        return "Deveria retornar lista";
    }


}