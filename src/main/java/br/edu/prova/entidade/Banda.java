package br.edu.prova.entidade;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Banda {

	
	@Id
	@SequenceGenerator(name = "CONTADOR_BANDA", sequenceName = "NUM_SEQ_BANDA", allocationSize = 0)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CONTADOR_BANDA")
	private Integer id;
	
	@NotBlank
	private String nome;
	
	private String site;
	
	@NotNull
	private Date dataFundacao;
	
	@NotBlank
	private String telefone;
	
	@NotBlank
	private String tipoMusica;
	
	@NotBlank
	private String nacionalidade;
	
	public Banda() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public Date getDataFundacao() {
		return dataFundacao;
	}

	public void setDataFundacao(Date dataFundacao) {
		this.dataFundacao = dataFundacao;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getTipoMusica() {
		return tipoMusica;
	}

	public void setTipoMusica(String tipoMusica) {
		this.tipoMusica = tipoMusica;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	
}
