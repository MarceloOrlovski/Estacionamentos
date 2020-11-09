package br.com.marceloorlovski.Estacionamento.Controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.marceloorlovski.Estacionamento.dto.ClienteDTO;
import br.com.marceloorlovski.Estacionamento.service.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	@Autowired
	private ClienteService repository;
	
	@PostMapping(value = "/salvar")
	public void Salvar(@RequestBody ClienteDTO cliente) {
		repository.salvar(cliente);
	}

}
