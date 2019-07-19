package br.edu.prova.web;

import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.edu.prova.entidade.Evento;
import br.edu.prova.servico.EventoServico;

@Named
@RequestScoped
public class EventoBean {

	@EJB
	private EventoServico eventoServico;
	
	private Evento evento;
		
	
	public EventoBean() {
		this.evento = new Evento();
	}
	
	public void cadastrarEvento() {
		this.eventoServico.cadastrarEvento(evento);
		this.evento = new Evento();
		JSFUtils.enviarMensagemDeInformacao("Evento Cadastrado");
	}
	
	public List<Evento> listarEvento(){
		return this.eventoServico.listarEvento();
	}

	public EventoServico getEventoServico() {
		return eventoServico;
	}

	public void setEventoServico(EventoServico eventoServico) {
		this.eventoServico = eventoServico;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}


	
	
	
}
