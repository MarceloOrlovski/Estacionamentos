package br.com.marceloorlovski.Estacionamento.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Vaga {
	
	
	// Declaração das variáveis
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String nomeVaga;
	
	@OneToOne
	private Integer Ticket;
	
	
	// Inicio Metodo gets e sets	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeVaga() {
		return nomeVaga;
	}

	public void setNomeVaga(String nomeVaga) {
		this.nomeVaga = nomeVaga;
	}

	public Integer getTicket() {
		return Ticket;
	}

	public void setTicket(Integer ticket) {
		Ticket = ticket;
	}

	
	
}
