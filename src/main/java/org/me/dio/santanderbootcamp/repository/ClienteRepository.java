package org.me.dio.santanderbootcamp.repository;

import org.springframework.stereotype.Repository;
import org.me.dio.santanderbootcamp.domain.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    boolean existsByContaNumero(String numeroDaConta);
}
