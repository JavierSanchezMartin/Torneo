package com.torneo.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.torneo.dao.PartidoDAO;
import com.torneo.model.Partido;

public class PartidoDAOImpl implements PartidoDAO{
	@Autowired
	private SessionFactory sessionFactory;

	public PartidoDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@SuppressWarnings("unchecked")
	public List<Partido> partidosJugadosPorFase(int fase) {
		return (List<Partido>) sessionFactory.getCurrentSession().createQuery("from Partido").list();
	}

}
