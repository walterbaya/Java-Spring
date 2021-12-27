package com.educacionit.student.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.educacionit.student.api.model.StudentModel;

//Spring registra un controlador de tipo REST.
//REST es un patrón de arquitectura.

@RestController
@RequestMapping("students")
public class StudentController {
	
	//cuando quiera acceder a esto por localhost voy a ener que escribir
	//http://localhost:8080/students, cuando lo hagamos nos va a buscar
	//el metodo get que esta definido.
	@RequestMapping(method = RequestMethod.GET)
	//? es un generico, es decir puedo guardar cualquier cosa.
	public ResponseEntity<?> getAll(){
		List<StudentModel> list = new ArrayList<>();
		list.add(new StudentModel("Homer","Simpson", "909090", "jose@cardenas", "151321415"));
		list.add(new StudentModel("Bart","Simpson", "1290", "jose@lals", "15477775"));
		return ResponseEntity.ok(list);
		
	}
	
	
}
