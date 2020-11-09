package br.com.marceloorlovski.Estacionamento.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.marceloorlovski.Estacionamento.dto.ClienteDTO;
import br.com.marceloorlovski.Estacionamento.model.Clientes;
import br.com.marceloorlovski.Estacionamento.repository.ClienteRepository;



@Service

public class ClienteService {
	
	@Autowired
	private ClienteRepository repository;
	private Clientes cliente;

	public void salvar(ClienteDTO clienteDTO) {

		cliente = new Clientes();
		cliente = repository.findByName(clienteDTO.getNome());
		if(cliente == null) {
			cliente.setNome(clienteDTO.getNome());
			cliente.setEmail(clienteDTO.getEmail());
			repository.save(cliente);
		}
		
	}
	
}
