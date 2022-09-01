package teste;

import model.Aluno; //importação de pacote
					//ctrl + shift + o
public class TesteAluno {

	public static void main(String[] args) {
		System.out.println("--------");
		//String nome = new String ("Ana");
		//new = instancia de um objeto
		Aluno aluno1 = new Aluno();
		aluno1.matricula = 123;
		aluno1.nome = "Carlos";
		aluno1.email = "carlos@gmail.com";
		
		System.out.println(aluno1.matricula + "-" + aluno1.nome + "-" + aluno1.email);
		
		Aluno aluno2 = new Aluno();
		Aluno aluno3 = new Aluno();
		Aluno aluno4 = new Aluno();
		
		if (aluno1==aluno2) {
			System.out.println("objetos iguais");
		} else {
			System.out.println("objetos diferentes");
		}
	}

}
