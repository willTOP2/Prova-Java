package br.com.teste.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



@Entity
public class Cliente {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	 private int codigo; 
	
	@Column(name="name")
	 private String nome; 
	
	@Column(name="cpf")
	private String cpf; 
	 
	@Column(name="rg") 
	private String rg;

	@ManyToOne(targetEntity = Endereco.class, cascade = {CascadeType.ALL})
	

    @JoinColumn(name = "codigo_cliente")
	private Endereco endereco;
	
	
	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	
	
	public Cliente(int codigo, String nome, String cpf, String rg, Endereco endereco) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.endereco = endereco;
	}

	public Cliente() {
		
	}
	
	 
	
	
	
	
	
	
	

}
