package pe.edu.tecsup.springbootapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import pe.edu.tecsup.springbootapp.beans.Calculadora;
import pe.edu.tecsup.springbootapp.beans.Saludo;


@SpringBootApplication
public class SpringBootAppCpeApplication implements CommandLineRunner{

	private static Logger log 
		= LoggerFactory.getLogger(SpringBootAppCpeApplication.class);

	@Autowired
	private Calculadora calculadora;
	
	@Qualifier("SaludoInglesImpl")
	@Autowired
	private Saludo saludo;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootAppCpeApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		log.info("Hola Mundo con SprinBoot....!");
		
		Double resultado = calculadora.sumar(15.0, 5.0);
		log.info("Resultado: " + resultado);
		
		log.info(saludo.dia("Jaime Gomez"));
		
		
		
	}

}
