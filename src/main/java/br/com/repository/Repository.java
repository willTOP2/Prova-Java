package br.com.repository;





import org.springframework.data.jpa.repository.JpaRepository;

import br.com.model.Cliente;



public interface Repository extends JpaRepository<Cliente, Long>{

	

}
