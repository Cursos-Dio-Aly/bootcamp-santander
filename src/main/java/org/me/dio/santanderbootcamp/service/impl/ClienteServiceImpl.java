package org.me.dio.santanderbootcamp.service.impl;

import org.me.dio.santanderbootcamp.domain.model.Cliente;
import org.me.dio.santanderbootcamp.repository.ClienteRepository;
import org.me.dio.santanderbootcamp.service.ClienteService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class ClienteServiceImpl implements ClienteService {
    private final ClienteRepository repository;

    public ClienteServiceImpl(ClienteRepository repository) {
        this.repository = repository;
    }

    @Override
    public Cliente findById(Long id) {
        return repository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Cliente criar(Cliente entity) {
        boolean existCliente = repository.existsByContaNumero(entity.getConta().getNumero());
        if (existCliente)
            throw new RuntimeException("Essa conta já existe!");

        return repository.save(entity);
    }
}
