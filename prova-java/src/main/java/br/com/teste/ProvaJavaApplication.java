package br.com.teste;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ProvaJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProvaJavaApplication.class, args);
	}

}
