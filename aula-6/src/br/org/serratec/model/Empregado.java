package br.org.serratec.model;

//A classe, como abstrata, não poderá ser instanciada
//pode criar métodos abstratos
public abstract class Empregado {
	private String cpf;
	private String nome;
	protected Double salario;
	
	public Empregado(String cpf, String nome, Double salario) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.salario = salario;
	}
	
	
	
	@Override
	public String toString() {
		return "Empregado [cpf=" + cpf + ", nome=" + nome + ", salario=" + salario + "]";
	}



	public String getCpf() {
		return cpf;
	}
	public String getNome() {
		return nome;
	}
	public Double getSalario() {
		return salario;
	}
	 // assinatura de método abstrato; este método não tem implementação
	//todos os filhos são obrigados a implementar esse método.
	public abstract void aumentarSalario();
}
