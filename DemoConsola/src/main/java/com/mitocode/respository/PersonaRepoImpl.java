package com.mitocode.respository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.mitocode.DemoConsolaApplication;

@Repository
public class PersonaRepoImpl implements IPersonaRepo {

	//Con getlogger obtenemos el logger que ya existe y sino lo crea.
	//por eso es importante en parte tener los nombres de los loggers asociados a las classes correspondientes
	//no podiamos acceder a este logger ya que era privado, pero utilizando getLogger si es posible.
	
	public static Logger LOG = LoggerFactory.getLogger(DemoConsolaApplication.class);

	@Override
	public void registrar(String nombre) {
		LOG.info("Se registro a: " + nombre);
	}

}
