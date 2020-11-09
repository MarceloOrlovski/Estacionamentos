package br.com.marceloorlovski.Estacionamento.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Veiculo {
	
	
	// Declaração das variáveis
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String marca;
	
	private String placa;
	
	private String modelo;
	
	private String cor;
	

	private Integer vaga;
	

	@SuppressWarnings("unused")
	private Integer idCliente;

	
	// Inicio dos métodos gets e sets
	
	
	
	public Integer getIdCliente() {
		return getIdCliente();
	}
	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public Integer getVaga() {
		return vaga;
	}
	public void setVaga(Integer vaga) {
		this.vaga = vaga;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}	
	
	
}
