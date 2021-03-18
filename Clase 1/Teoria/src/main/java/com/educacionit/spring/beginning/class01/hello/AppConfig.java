
package com.educacionit.spring.beginning.class01.hello;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
  

@Configuration
public class AppConfig {
	
	
	public AppConfig () {
		
		super ();
	}
 
	
    @Bean (name="com")
    public Component getBean () {
    	
    	Component com = new Component ();
    	com.send ("Hola");
    	
        return com;
    }
}