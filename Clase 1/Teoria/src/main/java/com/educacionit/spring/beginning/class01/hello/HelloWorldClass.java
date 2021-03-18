
package com.educacionit.spring.beginning.class01.hello;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class HelloWorldClass {
	
	
	public HelloWorldClass () {
		
		super ();
	}

	
	@SuppressWarnings ("resource")
	public static void main (String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext (AppConfig.class);
		
        Component bean = (Component) context.getBean ("com");
        bean.send ("Roman");

	}
}