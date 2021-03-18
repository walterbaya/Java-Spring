package com.educacionit.spring.beginning.class01.hello;

public class Test {

	public static void main(String[] args) {
		
		//La idea es no iniciar este Component()
		//lo ideal es que Spring me lo inicialice
		Component com = new Component();
		com.setMessage("Mensaje a enviar a: ");
		
		com.send("Homer Simpson");
	}
}
