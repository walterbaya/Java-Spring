package com.educacionit.student.api.model;

import lombok. *;

//Con estos simples anotation nos genera los getters y setters de todos los atributos
//privados que tengamos en la logica de nuestra clase.
//Constructores con y sin parametros, para saber mas hay
//que simplemente leer la documentacion

@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class StudentModel {

	private String name;
	private String lastName;
	private String dni;
	private String email;
	private String mobile;

	
}
