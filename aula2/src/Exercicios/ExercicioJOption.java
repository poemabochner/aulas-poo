package Exercicios;

import javax.swing.JOptionPane;

//4) Usando a classe JOptionPane, leia nome, telefone, email 
	//e salário do teclado e exiba as informações digitadas na tela com salário com
	//acréscimo de 10%.
public class ExercicioJOption {

	public static void main(String[] args) {
		//double salario1=0;
		
		String nome = JOptionPane.showInputDialog("Entre com o nome: ");
		String telefone = JOptionPane.showInputDialog("Entre com o telefone: ");
		String email = JOptionPane.showInputDialog("Entre com o email: ");
		String salario = JOptionPane.showInputDialog("Entre com o salario: ");
		
		Double salario2 = Double.parseDouble(salario);
		salario2 = salario2 + salario2*10/100;
		JOptionPane.showMessageDialog(null, "nome: "+nome+"\ntelefone: "+ telefone + "\nemail: "+email+"\nsalário com acréscimo de 10%: "+ salario2);
		
	}

}
