package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.service.GameService;


@SpringBootApplication
public class EjercicioConsolaApplication implements CommandLineRunner{

	private static Logger LOG = LoggerFactory.getLogger(EjercicioConsolaApplication.class);
	
	@Autowired
	private GameService servicio;
	
	public static void main(String[] args) {
		SpringApplication.run(EjercicioConsolaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LOG.info("Este mensaje está siendo enviado desde LOG");
		servicio.insertWinner(15);
		servicio.insertWinner(17);
		servicio.insertWinner(2);
		servicio.insertWinner(9);
		servicio.getAllWinnersNumbers();
	}

}
