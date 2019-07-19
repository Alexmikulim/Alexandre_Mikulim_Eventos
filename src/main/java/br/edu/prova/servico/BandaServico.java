package br.edu.prova.servico;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.edu.prova.entidade.Banda;
import br.edu.prova.entidade.Evento;

@Stateless
public class BandaServico {
	
	@PersistenceContext
	private EntityManager em;
	
	
	public void cadastrarBanda (Banda banda) throws Exception {
		List<Banda> bandas = listarBandaPorNome(banda);
		if(!bandas.isEmpty()) {
			throw new Exception("Não é possivel cadastrar pois já existe uma Banda com este nome.");
		}
		this.em.persist(banda);
	}
	
	public void excluirBanda (Banda banda) throws Exception {
		List<Evento> eventos = listarBandaPorEvento(banda);
		if(!eventos.isEmpty()) {
			throw new Exception("Não é possivel excluir pois ja existe um evento com esta banda.");
		}
		this.em.remove(this.em.merge(banda));
	}
	
	public List<Banda> listarBanda(){
		return this.em.createQuery("SELECT b FROM Banda b", Banda.class).getResultList();
	}
	
	public List<Banda> listarBandaPorNome(Banda banda){
		return this.em.createQuery("SELECT b FROM Banda b WHERE b.nome=:p1", Banda.class).setParameter("p1", banda.getNome()).getResultList();
	}
	
	public List<Evento> listarBandaPorEvento(Banda banda){
		return this.em.createQuery("SELECT e FROM Evento e WHERE e.banda=:p1", Evento.class).setParameter("p1", banda).getResultList();
	}

}
