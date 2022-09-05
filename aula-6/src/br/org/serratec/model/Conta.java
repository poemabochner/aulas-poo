package br.org.serratec.model;
//uma interface não pode ter instâncias
//não pode fazer - Conta conta = new Conta();
//é uma forma de substituir a herança em alguns casos.
//toda interface é criada para ter somente assinaturas
//interfaces não tem implementação

public interface Conta {
	Double taxaBancaria=2.50; // vai ser estático
	
	
	
	//não é necessário colocar o abstract ou public pq eles estão implícitos
	
	public Boolean saque(Double valor);
	
	public Boolean deposito(Double valor);
	
}
