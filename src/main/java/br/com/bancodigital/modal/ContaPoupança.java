package br.com.bancodigital.modal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tab_ContaPoupanca")
public class ContaPoupança extends Conta{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idContaPoupanca;
	@Column(length = 15, nullable = false)
	private final String DESCRICAO_CONTA = "ContaPoupaça";
	@Column(nullable = false)
	private Float txJuros;
	
	public Long getIdContaPoupanca() {
		return idContaPoupanca;
	}
	public void setIdContaPoupanca(Long idContaPoupanca) {
		this.idContaPoupanca = idContaPoupanca;
	}
	public Float getTxJuros() {
		return txJuros;
	}
	public void setTxJuros(Float txJuros) {
		this.txJuros = txJuros;
	}
	public String getDESCRICAO_CONTA() {
		return DESCRICAO_CONTA;
	}
	
	
	

}
