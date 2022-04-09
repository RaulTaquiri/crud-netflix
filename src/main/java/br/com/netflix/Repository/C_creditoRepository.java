package br.com.netflix.Repository;

import br.com.netflix.model.C_credito;
import br.com.netflix.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface C_creditoRepository extends JpaRepository<C_credito,Integer> {
}
