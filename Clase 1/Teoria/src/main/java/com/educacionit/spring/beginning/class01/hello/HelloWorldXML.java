
package com.educacionit.spring.beginning.class01.hello;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class HelloWorldXML {
	
	
	public HelloWorldXML () {
		
		super ();
	}

	
	@SuppressWarnings ("resource")
	public static void main (String[] args) {
		
		//ApplicationContext es el lugar donde vamos a guardar todo lo que la aplicacion necesita
		
		ApplicationContext context = new ClassPathXmlApplicationContext ("applicationContext1.xml");
        
		Component bean = (Component) context.getBean ("com");
        bean.send ("Raul");
        
        context = null;
	}
}