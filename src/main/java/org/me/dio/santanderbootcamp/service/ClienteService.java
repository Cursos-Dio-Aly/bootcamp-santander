package org.me.dio.santanderbootcamp.service;

import org.me.dio.santanderbootcamp.domain.model.Cliente;

import java.util.Optional;

public interface ClienteService {
    Cliente findById(Long id);

    Cliente criar(Cliente entity);
}
