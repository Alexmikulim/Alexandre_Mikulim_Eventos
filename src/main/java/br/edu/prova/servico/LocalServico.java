package br.edu.prova.servico;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.edu.prova.entidade.Local;

@Stateless
public class LocalServico {

	@PersistenceContext
	private EntityManager em;
	
	public void cadastrarLocal(Local local) {
		this.em.persist(local);
	}
	
	public List<Local> listarLocal(){
		return this.em.createQuery("SELECT l FROM Local l", Local.class).getResultList();
	}
}
