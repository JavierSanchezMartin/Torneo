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
	private int id;
	@Column(name = "ID_TORNEO")
	private int idTorneo;
	@Column(name = "EQUIPO_LOCAL")
	private int equipoLocal;
	@Column(name = "EQUIPO_VISITANTE")
	private int equipoVisitante;
	@Column(name = "RONDA")
	private String ronda;
	@Column(name = "FASE")
	private String fase;
	
	public Partido() {}
	
	public Partido(int id, int idTorneo, int equipoLocal, int equipoVisitante, String fase) {
		this.id = id;
		this.idTorneo = idTorneo;
		this.equipoLocal = equipoLocal;
		this.equipoVisitante = equipoVisitante;
		this.fase = fase;
	}
	public int getIdPartido() {
		return id;
	}
	public void setIdPartido(int id) {
		this.id = id;
	}
	public int getIdTorneo() {
		return idTorneo;
	}
	public void setId_torneo(int idTorneo) {
		this.idTorneo = idTorneo;
	}
	public int getEquipoLocal() {
		return equipoLocal;
	}
	public void setEquipoLocal(int equipoLocal) {
		this.equipoLocal = equipoLocal;
	}
	public int getEquipoVisitante() {
		return equipoVisitante;
	}
	public void setEquipo_visitante(int equipoVisitante) {
		this.equipoVisitante = equipoVisitante;
	}
	public String getRonda() {
		return ronda;
	}
	public void setRonda(String ronda) {
		this.ronda = ronda;
	}
	public String getFase() {
		return fase;
	}
	public void setFase(String fase) {
		this.fase = fase;
	}
}
