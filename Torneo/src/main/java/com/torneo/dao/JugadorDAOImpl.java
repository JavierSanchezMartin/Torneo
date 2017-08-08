package com.torneo.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.torneo.model.Jugador;

@Repository
public class JugadorDAOImpl implements JugadorDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public JugadorDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@SuppressWarnings("unchecked")
	public List<Jugador> listJugador() {
		return (List<Jugador>) sessionFactory.getCurrentSession().createQuery("from Jugador").list();
	}

}
