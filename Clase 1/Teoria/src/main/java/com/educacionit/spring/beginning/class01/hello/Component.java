package com.educacionit.spring.beginning.class01.hello;

public class Component {
	
	
	private String msg = "";
	
	
	public void setMessage (String msg) {
		
		this.msg = msg;
	}
	
	public void send(String content) {
		
		System.out.println (this.msg.concat (" ").concat (content));
	}
}