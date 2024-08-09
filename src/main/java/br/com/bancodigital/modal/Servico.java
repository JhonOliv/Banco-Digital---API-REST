package br.com.bancodigital.modal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tab_service")
public class Servico {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idServico;
	@Column(length = 20, nullable = false)
	private String descServico;
	@ManyToOne
	private Conta conta;
	
	public Conta getConta() {
		return conta;
	}
	public void setConta(Conta conta) {
		this.conta = conta;
	}
	public String getDescServico() {
		return descServico;
	}
	public Long getIdServico() {
		return idServico;
	}
	public void setDescServico(String descServico) {
		this.descServico = descServico;
	}

	
	
}
