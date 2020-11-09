package br.com.marceloorlovski.Estacionamento.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ticket {
	
	// Declaração das variáveis
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idTicket;
	private Date HoraEntrada;
	private Date HoraSaida;
	private String Valor;
	
	// Inicio dos métodos gets e sets
	
	
	public Long getIdTicket() {
		return idTicket;
	}
	public void setIdTicket(Long idTicket) {
		this.idTicket = idTicket;
	}
	public Date getHoraEntrada() {
		return HoraEntrada;
	}
	public void setHoraEntrada(Date horaEntrada) {
		HoraEntrada = horaEntrada;
	}
	public Date getHoraSaida() {
		return HoraSaida;
	}
	public void setHoraSaida(Date horaSaida) {
		HoraSaida = horaSaida;
	}
	public String getValor() {
		return Valor;
	}
	public void setValor(String valor) {
		Valor = valor;
	}
	
	
}
