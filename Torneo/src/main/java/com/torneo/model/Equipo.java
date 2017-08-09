package com.torneo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "equipo")
public class Equipo {

	@Id
    @GeneratedValue
    @Column(name = "ID_EQUIPO")
	private int id;
	@Column(name = "NOMBRE")
	private String nombre;
	
	public Equipo() {}
	
	public Equipo(String nombre) {
		this.nombre = nombre;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
