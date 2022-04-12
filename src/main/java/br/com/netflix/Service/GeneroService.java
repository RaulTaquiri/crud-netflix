package br.com.netflix.Service;

import br.com.netflix.Repository.GeneroRepository;
import br.com.netflix.model.Genero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GeneroService {
    @Autowired
    private GeneroRepository repository;
    public Genero salvar (Genero genero){
        return repository.save(genero);
    }
}
