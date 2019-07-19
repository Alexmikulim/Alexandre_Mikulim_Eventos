package br.edu.prova.web;

import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.edu.prova.entidade.Banda;
import br.edu.prova.servico.BandaServico;

@Named
@RequestScoped
public class BandaBean {

	@EJB
	private BandaServico bandaServico;
	
	private Banda banda;
	
	private List<Banda> bandas;
	
	public BandaBean() {
		this.banda = new Banda();
	}
	
	public void cadastrarBanda() {
		try {
		this.bandaServico.cadastrarBanda(banda);
		this.banda = new Banda();
		JSFUtils.enviarMensagemDeInformacao("Banda Cadastrada");
		}catch (Exception e) {
			JSFUtils.enviarMensagemDeAtencao(e.getMessage());
		}
	}
	
	public void excluiBanda(Banda banda) {
		try {
		this.bandaServico.excluirBanda(banda);
		JSFUtils.enviarMensagemDeInformacao("Banda Excluida");
		}catch (Exception e) {
			JSFUtils.enviarMensagemDeAtencao(e.getMessage());
		}
	}
	
	public List<Banda> listarBanda(){
		return this.bandaServico.listarBanda();
	}

	public BandaServico getBandaServico() {
		return bandaServico;
	}

	public void setBandaServico(BandaServico bandaServico) {
		this.bandaServico = bandaServico;
	}

	public Banda getBanda() {
		return banda;
	}

	public void setBanda(Banda banda) {
		this.banda = banda;
	}

	public List<Banda> getBandas() {
		if(this.bandas ==null) {
			this.bandas=this.bandaServico.listarBanda();
		}
		return bandas;
	}

	public void setBandas(List<Banda> bandas) {
		this.bandas = bandas;
	}
	
	
}
