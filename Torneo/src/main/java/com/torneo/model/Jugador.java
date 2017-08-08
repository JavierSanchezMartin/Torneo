package com.torneo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "JUGADOR")
public class Jugador {

	@Id
	@GeneratedValue
	@Column(name = "ID_JUGADOR")
	private int id_jugador;
	@Column(name = "DNI")
	private String dni;
	@Column(name = "NOMBRE")
	private String nombre;
	@Column(name = "APELLIDO")
	private String apellido;
	@Column(name = "ID_EQUIPO")
	private int id_equipo;

	public Jugador() {
	}

	public Jugador(int id_jugador, String dni, String nombre, String apellido, int id_equipo) {
		this.id_jugador = id_jugador;
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.id_equipo = id_equipo;
	}

	public int getId_jugador() {
		return id_jugador;
	}

	public void setId_jugador(int id_jugador) {
		this.id_jugador = id_jugador;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getId_equipo() {
		return id_equipo;
	}

	public void setId_equipo(int id_equipo) {
		this.id_equipo = id_equipo;
	}

}
