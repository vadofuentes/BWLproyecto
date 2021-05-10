package com.bwl.clima.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bwl.clima.model.Tareas;
import com.bwl.clima.service.TareasService;



@RestController
@RequestMapping("/tarea/")
public class TareasRest {
	
	@Autowired
	private TareasService tareasService;
	
	@GetMapping
	private ResponseEntity<List<Tareas>> getAllTareas(){
		return ResponseEntity.ok(tareasService.findAll());
	}

}
