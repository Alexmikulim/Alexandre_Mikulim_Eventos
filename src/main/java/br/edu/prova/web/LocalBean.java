package br.edu.prova.web;

import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.edu.prova.entidade.Local;
import br.edu.prova.servico.LocalServico;

@Named
@RequestScoped
public class LocalBean {

	@EJB
	private LocalServico localServico;
	
	private Local local;
	
	private List<Local> locais;
	
	public LocalBean() {
		this.local = new Local();
	}
	
	public void cadastrarLocal() {
		this.localServico.cadastrarLocal(local);
		this.local = new Local();
		JSFUtils.enviarMensagemDeInformacao("Local de Evento Cadastrado");
	}
	
	public List<Local> listarLocais(){
		return this.localServico.listarLocal();
	}

	public LocalServico getLocalServico() {
		return localServico;
	}

	public void setLocalServico(LocalServico localServico) {
		this.localServico = localServico;
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}

	public List<Local> getLocais() {
		if(this.locais ==null) {
			this.locais = localServico.listarLocal();
		}
		return locais;
	}

	public void setLocais(List<Local> locais) {
		this.locais = locais;
	}
	
	
}
