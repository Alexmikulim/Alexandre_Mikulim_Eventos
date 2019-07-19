package br.edu.prova.entidade;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

@Entity
public class Evento {

	@Id
	@SequenceGenerator(name = "CONTADOR_EVENTO", sequenceName = "NUM_SEQ_EVENTO", allocationSize = 0)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CONTADOR_EVENTO")
	private Integer id;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name = "fk_local")
	private Local local;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name = "fk_banda")
	private Banda banda;
	
	@NotNull
	private Date dataEvento;
	
	public Evento() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}

	public Banda getBanda() {
		return banda;
	}

	public void setBanda(Banda banda) {
		this.banda = banda;
	}

	public Date getDataEvento() {
		return dataEvento;
	}

	public void setDataEvento(Date dataEvento) {
		this.dataEvento = dataEvento;
	}
	
	
	
}
