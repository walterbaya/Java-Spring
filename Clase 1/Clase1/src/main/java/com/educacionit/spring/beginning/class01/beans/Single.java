
package com.educacionit.spring.beginning.class01.beans;


import static org.apache.commons.lang3.RandomStringUtils.randomAlphanumeric;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class Single {

	//atributo llamado code
	private String code = "";
	
	
	public Single () {
		
		super ();
		System.out.println ("LLAMADA DESDE EL CONSTRUCTOR!!!");
		this.code = randomAlphanumeric (12);
                //el codigo es un conjunto de caracteres aleatorio 12 letras
                this.code = randomAlphanumeric (12);
	}
	
	
	@PreDestroy
	public void pre () {
		System.out.println ("LLAMADA DESDE EL METODO PRE!!!");
	}
	
	@PostConstruct
	public void post () {
		System.out.println ("LLAMADA DESDE EL METODO POST!!!");
	}
	
	
	public String getCode () {
		
		return this.code;
	}
}