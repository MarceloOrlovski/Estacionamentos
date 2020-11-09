package br.com.marceloorlovski.Estacionamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.marceloorlovski.Estacionamento.model.Clientes;

@Repository

public interface ClienteRepository extends JpaRepository<Clientes, Long> {

	Clientes findByName(String nome);

}
