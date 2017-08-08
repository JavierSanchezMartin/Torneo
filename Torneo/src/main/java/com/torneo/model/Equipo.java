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
	private int id_equipo;
	@Column(name = "NOMBRE")
	private String nombre;
	
	public Equipo() {}
	
	public Equipo(int id_equipo, String nombre) {
		this.id_equipo = id_equipo;
		this.nombre = nombre;
	}
	
	public int getId_equipo() {
		return id_equipo;
	}
	public void setId_equipo(int id_equipo) {
		this.id_equipo = id_equipo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
