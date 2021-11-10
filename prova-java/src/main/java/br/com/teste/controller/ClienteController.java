package br.com.teste.controller;


import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.teste.entity.CepService;
import br.com.teste.entity.Cliente;
import br.com.teste.entity.Endereco;
import br.com.teste.entity.EnderecoCep;
import br.com.teste.repository.ClienteRepository;


@RestController 
@RequestMapping("/cliente")
public class ClienteController  {
	
	@Autowired
	private ClienteRepository clienteRepository; 
	
	@Autowired
	private CepService service;
	
	
	
	@PostMapping
	public ResponseEntity<Cliente> save(@RequestBody Cliente cliente){
		
  
		 clienteRepository.save(cliente);   
		
		 return new ResponseEntity<>(cliente, HttpStatus.OK);
	}
	
	
	
	
	
	
	@GetMapping
	public ResponseEntity<List<Cliente>> CepAll(){
		 
		 List<Cliente> clientes = new ArrayList<>(); 
		 
	  clientes = clienteRepository.findAll(); 
	  return new ResponseEntity<>(clientes, HttpStatus.OK);
	}

	
	
	@GetMapping("/{id}")
	public ResponseEntity <Optional<Cliente>> getbyId(@PathVariable Integer id){
	
		Optional<Cliente> cliente; 
		try {
			
			
			cliente = clienteRepository.findById(id); 
			return new ResponseEntity<Optional<Cliente>>(cliente, HttpStatus.OK);
			
			
		} catch (NoSuchElementException error) {
			
			return new ResponseEntity<Optional<Cliente>>(HttpStatus.NOT_FOUND);
		}
		
		
		
	}

	
	
	
	
	
	
	

	 @GetMapping("/endereco/{cep}")
	    public ResponseEntity<Endereco> getCep(@PathVariable String cep) {

	        Endereco endereco = service.buscaEnderecoPorCep(cep); 
	        
	        
	       

	        return endereco != null ? ResponseEntity.ok().body(endereco) : ResponseEntity.notFound().build(); 
	    }
	
	
	
	
	
	
	
	

}
