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

	/**
	 * Constructor
	 * @param sessionFactory
	 */
	public JugadorDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@SuppressWarnings("unchecked")
	public List<Jugador> listarJugadores() {
		return (List<Jugador>) sessionFactory.getCurrentSession().createQuery("from Jugador").list();
	}

	public void insertarOrModificar(Jugador jugador) {
		sessionFactory.getCurrentSession().saveOrUpdate(jugador);
	}

	public Jugador consultarJugador(int idJugador) {
		String select = "FROM Jugador WHERE id = " + idJugador;
		@SuppressWarnings("unchecked")
		List<Jugador> listaJugadores = (List<Jugador>) sessionFactory.getCurrentSession().createQuery(select).list();
		
		if (listaJugadores != null && !listaJugadores.isEmpty())
			return listaJugadores.get(0);
		
		return null;
	}
	
	public void eliminarJugador(Jugador jugador) {
		sessionFactory.getCurrentSession().delete(jugador);
	}
	
	/**
	 * Getter SessionFactory.
	 * @return
	 */
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	/**
	 * Setter SessionFactory
	 * @param sessionFactory
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
