package br.com.netflix.Resource;

import br.com.netflix.Repository.C_creditoRepository;
import br.com.netflix.model.C_credito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class C_creditoResource {
    @Autowired
    private C_creditoRepository repository;
    public C_credito salvar (C_credito c_credito){
        return repository.save(c_credito);
    }
}
