package br.org.serratec.model;

public interface Conta {
	public Boolean saque(Double valor);
	public Boolean deposito (Double valor);
}
