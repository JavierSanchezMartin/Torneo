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
	@Column(name = "grupo")
	private int grupo;
	
	public Equipo() {}
	
	public Equipo(int id, String nombre, int grupo) {
		this.id = id;
		this.nombre = nombre;
		this.grupo = grupo;
	}
	
	public int getIdEquipo() {
		return id;
	}
	public void setIdEquipo(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getGrupo() {
		return grupo;
	}
	public void setGrupo(int grupo) {
		this.grupo = grupo;
	}
}
