package br.com.teste.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@Entity
public class Endereco { 
	
	

	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	 private int codigo; 
	
	
	@Column(name="rua")
	 private String rua; 
	
	
	@Column(name="bairro")
	private String bairro; 
	
	
	@Column(name="numero")
	private String numero; 
	
	 @JsonProperty("localidade")
	@Column(name="cidade")
	private String cidade;

	 
	 @JsonProperty("uf")
		@Column(name="estado")
	 private String estado;

	public int getCodigo() {
		return codigo;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getRua() {
		return rua;
	}


	public void setRua(String rua) {
		this.rua = rua;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	





	public Endereco(int codigo, String rua, String bairro, String numero, String cidade, String estado) {
		super();
		this.codigo = codigo;
		this.rua = rua;
		this.bairro = bairro;
		this.numero = numero;
		this.cidade = cidade;
		this.estado = estado;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public Endereco() {
		
	}
	
	
	
	
	
	
	
	
	

}
