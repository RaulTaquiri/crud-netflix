package br.com.netflix.Service;

import br.com.netflix.Repository.UsuarioRepository;
import br.com.netflix.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository repository;

    public Usuario salvar (Usuario usuario){
        return repository.save(usuario);
    }
    public Usuario atualizar(Usuario usuario)throws Exception{
        if (usuario.getId()==null){
            throw new Exception("Id não encontrado");
        }
        return repository.save(usuario);
    }

    public void deletar(int id){
        repository.deleteById(id);
    }
    public List<Usuario> listar(){
       return repository.findAll();
    }

}
