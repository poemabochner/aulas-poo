package teste;

import java.util.Scanner;

public class TesteLeitura {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		
		System.out.println("entre com um valor: ");
		a=sc.nextInt();
		
		System.out.println("entre com um segundo valor: ");
		b=sc.nextInt();
		
		System.out.println("\n O resultado da soma é: " + (a+b));
	
		sc.close();
	}
}
