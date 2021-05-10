package com.bwl.clima.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Tareas")
public class Tareas {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name = "description", nullable = false, length = 25)
	private String description;
	@Column(nullable = false)
	private Boolean status;
	
	public Tareas() {
	
	}
	public Tareas(String description, Boolean status) {
		super();
		this.description = description;
		this.status = status;
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}

	
	
}
