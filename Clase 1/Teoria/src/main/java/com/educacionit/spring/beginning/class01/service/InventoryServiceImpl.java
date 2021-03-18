
package com.educacionit.spring.beginning.class01.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import org.apache.log4j.Logger;


@Service ("inventoryServiceBean")
public class InventoryServiceImpl implements IInventoryService {
	
	//Lo común es utilizar el autowired arriba del objeto que se esta creando
	//en este caso estamos declarando como corresponse, Spring siempre es quien inicializa
	//veamos que como puede traer muchos objetos podemos elegir un qualifier para decirle
	//cual de todas las clases que implementan debe ser el objeto que nos traiga en este caso
	//decimos de todos los objetos posibles inicializables, cuya clase implementa ICrud
	//traeme aquel cuya clase sea de tipo inventoryDaoBean
	@Autowired
	@Qualifier ("inventoryDaoBean")
	private ICrud dao = null;
	
	
	private static final Logger logger = Logger.getLogger (InventoryServiceImpl.class);
	
	
	public InventoryServiceImpl () {
		
		super ();
	}
	
	
	public void setInventoryDao (ICrud dao) {
		
		this.dao = dao;
	}
	

	/* (non-Javadoc)
	 * @see com.educacionit.spring.beginning.class01.service.IInventoryService#add (java.lang.String)
	 */
	@Override
	public void add(String item) {
		
		logger.info ("Adding ".concat (item));
		this.dao.add (item);
	}
}