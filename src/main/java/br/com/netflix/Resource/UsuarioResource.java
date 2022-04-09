package br.com.netflix.Resource;

import br.com.netflix.Service.UsuarioService;
import br.com.netflix.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioResource {
    @Autowired
    private UsuarioService service;
    @PostMapping
    public Usuario salvar(@RequestBody Usuario usuario){
        usuario = service.salvar(usuario);
        return usuario;
    }
    @PostMapping
    public Usuario atualizar(@RequestBody Usuario usuario) throws Exception {
        return service.atualizar(usuario);
    }



}
