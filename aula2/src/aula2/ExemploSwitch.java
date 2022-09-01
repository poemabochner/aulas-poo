package aula2;

public class ExemploSwitch {
	
	public static void main(String[]args) {
		int mes = 5;
		switch (mes){
			case 1:
				System.out.println("janeiro");
			break;
			case 2:
				System.out.println("fevereiro");
			break;
			
			default:
				System.out.println("mês inválido");
				break;
		}
	}
}
