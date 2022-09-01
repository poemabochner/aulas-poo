package Exercicios;

//1) Criar uma classe com o nome SituacaoAluno. Faça um programa com duas variáveis 
//nota1 e nota2 com valor inicial definido.
//Calcule a média e caso o valor maior ou igual a 7 deverá ser exibida a mensagem “Aprovado”.
//Caso a média for menor que 7 “Reprovado” e se a media for igual 10 “Aprovado Parabéns”.

public class ExercicioSituacaoAluno {
	public static void main(String[] args) {
		double nota1=8, nota2=7;
		double media;
		
		media = nota1 + nota2 / 2;
		
		if (media >= 7) {
			System.out.println("Aprovado");
		} else if (media==10) {
			System.out.println("Aprovado Parabéns");
		} else {
			System.out.println("Reprovado");
		}
	}
}
