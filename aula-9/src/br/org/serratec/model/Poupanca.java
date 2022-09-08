package br.org.serratec.model;

//import javax.management.RuntimeErrorException;

import br.org.serratec.exception.ContaException;

public class Poupanca implements Conta {
	private String titular;
	private Double saldo;

	public Poupanca(String titular, Double saldo) {
		super();
		this.titular = titular;
		this.saldo = saldo;
	}

	@Override
	public Boolean saque(Double valor) {
		if (saldo>valor) {
			saldo -= valor;
			return true;
		}
		throw new ContaException("Saldo insuficiente");
	}

	@Override
	public Boolean deposito(Double valor) {
		if (valor>0) {
			saldo += valor;
			return true;
		}
		throw new ContaException("Valor inválido");
		}

	@Override
	public String toString() {
		return "titular: " + titular + ", saldo: " + saldo;
	}

	public String getTitular() {
		return titular;
	}

	public Double getSaldo() {
		return saldo;
	}

}
