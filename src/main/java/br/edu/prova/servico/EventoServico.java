package br.edu.prova.servico;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.edu.prova.entidade.Evento;

@Stateless
public class EventoServico {
	
	@PersistenceContext
	private EntityManager em;
	
	public void cadastrarEvento (Evento evento) {
		this.em.persist(evento);
	}
	
	public List<Evento> listarEvento() {
		return this.em.createQuery("SELECT e FROM Evento e", Evento.class).getResultList();
	}

}
