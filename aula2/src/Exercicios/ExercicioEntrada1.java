package Exercicios;
//1) Criar uma classe com o nome Tabuada que exiba o conteúdo conforme abaixo:

import javax.swing.JOptionPane;

public class ExercicioEntrada1 {
	public static void main(String[] args) {
		double resultado=0;
		String numero = JOptionPane.showInputDialog("Digite o número:");
		
		Double n = Double.parseDouble(numero);
				
		for(int i=1; i<=10; i++) {
			resultado = n * i;
			JOptionPane.showMessageDialog(null, "+--Resultado--+\n"+ "| " + i + " * " + n +" = "+ resultado + " |" + "\n+-------------------+");
		}
	}
//deu certo porém parece que não dá para botar todos os resultados na mesma tela kkkkkkkkk (refazer depois)
}
