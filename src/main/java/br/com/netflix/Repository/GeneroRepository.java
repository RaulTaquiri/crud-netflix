package br.com.netflix.Repository;

import br.com.netflix.model.Genero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneroRepository
        extends JpaRepository<Genero, Integer> {
}