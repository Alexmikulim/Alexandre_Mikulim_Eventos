package br.edu.prova.entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Local {

	@Id
	@SequenceGenerator(name = "CONTADOR_LOCAL", sequenceName = "NUM_SEQ_LOCAL", allocationSize = 0)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CONTADOR_LOCAL")
	private Integer id;
	
	@NotBlank
	private String nome;
	
	@NotBlank
	private String cidade;
	
	@NotNull
	private Integer lotacao;
	
	@NotBlank
	private String telefone;
	
	public Local() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public Integer getLotacao() {
		return lotacao;
	}

	public void setLotacao(Integer lotacao) {
		this.lotacao = lotacao;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	
}
