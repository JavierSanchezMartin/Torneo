package com.torneo.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.torneo.model.Equipo;
import com.torneo.model.Jugador;

@Repository
public class EquipoDAOImpl implements EquipoDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public EquipoDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Boolean anadirEquipo(Equipo equipo) {
		System.out.println("DAO: "+equipo.getNombre());
		sessionFactory.getCurrentSession().save(equipo);
    	return true;
	}
	
	@SuppressWarnings("unchecked")
	public List<Equipo> listarEquipos() {
		return (List<Equipo>) sessionFactory.getCurrentSession().createQuery("from Equipo").list();
	}	

	@SuppressWarnings("unchecked")
	public int getCountGrupos() {
		return 0;
	}
	
}