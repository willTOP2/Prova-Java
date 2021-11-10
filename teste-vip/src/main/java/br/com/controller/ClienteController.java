package br.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.repository.Repository;

@RestController 
@RequestMapping("cliente-service")
public class ClienteController {

	  @Autowired
	  private Repository repository;
	  
}
