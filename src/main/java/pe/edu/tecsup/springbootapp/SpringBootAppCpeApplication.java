package pe.edu.tecsup.springbootapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import pe.edu.tecsup.springbootapp.beans.Calculadora;


@SpringBootApplication
public class SpringBootAppCpeApplication implements CommandLineRunner{

	private static Logger log 
		= LoggerFactory.getLogger(SpringBootAppCpeApplication.class);

	private Calculadora calculadora = new Calculadora();
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootAppCpeApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		log.info("Hola Mundo con SprinBoot....!");
		
		Double resultado = calculadora.sumar(15.0, 5.0);
		log.info("Resultado: " + resultado);
		
	}

}
