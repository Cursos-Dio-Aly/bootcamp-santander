package org.me.dio.santanderbootcamp;

import org.me.dio.santanderbootcamp.domain.model.*;
import org.me.dio.santanderbootcamp.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.util.Arrays;

@SpringBootApplication
public class SantanderBootcampApplication implements CommandLineRunner {
	@Autowired
	private ClienteRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SantanderBootcampApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Cartao cartao = new Cartao(1L, "1234567", BigDecimal.valueOf(3.400));
		Conta conta = new Conta(1L, "1234", "0000", BigDecimal.valueOf(2.500), BigDecimal.valueOf(1000));
		Funcionalidade funcionalidade = new Funcionalidade();
		funcionalidade.setId(1L);
		funcionalidade.setDescricao("Descrição");
		funcionalidade.setIcone("URL");
		Novidade novidade = new Novidade();
		novidade.setId(1L);
		novidade.setDescricao("Descrição icon");
		novidade.setIcone("Descrição icon");
		Cliente cliente = new Cliente(1L, "Alyasaf", conta, Arrays.asList(funcionalidade), cartao, Arrays.asList(novidade));

		repository.save(cliente);
	}
}
