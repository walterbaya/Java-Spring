package com.mitocode.respository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.mitocode.DemoConsolaApplication;

@Repository
public class PersonaRepoImpl implements IPersonaRepo{

	public static Logger LOG = LoggerFactory.getLogger(DemoConsolaApplication.class);
	@Override
	public void registrar(String nombre) {
		LOG.info("Se registro a: " + nombre);
	}

}
