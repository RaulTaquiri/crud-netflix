package br.com.netflix.Repository;

import br.com.netflix.model.Filme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;


@Repository
public interface FilmeRepository extends JpaRepository<Filme,Integer> {
}
