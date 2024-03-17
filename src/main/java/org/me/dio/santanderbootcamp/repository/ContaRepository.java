package org.me.dio.santanderbootcamp.repository;

import org.me.dio.santanderbootcamp.domain.model.Conta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Long> {
}
