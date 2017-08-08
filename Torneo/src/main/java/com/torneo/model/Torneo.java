package com.torneo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "torneo")
public class Torneo {

	@Id
    @GeneratedValue
    @Column(name = "ID_EQUIPO")
	private int id_torneo;
	@Column(name = "NOMBRE")
	private String nombre;
	@Column(name = "ESTADO")
	private int estado;
	@Column(name = "FECHA")
	private Date fecha;
	
	public Torneo() {}
	
	public Torneo(int id_torneo, String nombre, int estado, Date fecha) {
		this.id_torneo = id_torneo;
		this.nombre = nombre;
		this.estado = estado;
		this.fecha = fecha;
	}
	
	public int getId_torneo() {
		return id_torneo;
	}
	public void setId_torneo(int id_torneo) {
		this.id_torneo = id_torneo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
}
