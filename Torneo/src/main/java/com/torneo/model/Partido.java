package com.torneo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "partido")
public class Partido {

	@Id
    @GeneratedValue
    @Column(name = "ID_PARTIDO")
	private int id_partido;
	@Column(name = "ID_TORNEO")
	private int id_torneo;
	@Column(name = "EQUIPO_LOCAL")
	private int equipo_local;
	@Column(name = "EQUIPO_VISITANTE")
	private int equipo_visitante;
	@Column(name = "FASE")
	private String fase;
	
	public Partido() {}
	
	public Partido(int id_partido, int id_torneo, int equipo_local, int equipo_visitante, String fase) {
		this.id_partido = id_partido;
		this.id_torneo = id_torneo;
		this.equipo_local = equipo_local;
		this.equipo_visitante = equipo_visitante;
		this.fase = fase;
	}
	public int getId_partido() {
		return id_partido;
	}
	public void setId_partido(int id_partido) {
		this.id_partido = id_partido;
	}
	public int getId_torneo() {
		return id_torneo;
	}
	public void setId_torneo(int id_torneo) {
		this.id_torneo = id_torneo;
	}
	public int getEquipo_local() {
		return equipo_local;
	}
	public void setEquipo_local(int equipo_local) {
		this.equipo_local = equipo_local;
	}
	public int getEquipo_visitante() {
		return equipo_visitante;
	}
	public void setEquipo_visitante(int equipo_visitante) {
		this.equipo_visitante = equipo_visitante;
	}
	public String getFase() {
		return fase;
	}
	public void setFase(String fase) {
		this.fase = fase;
	}
}
