package Exercicio_Controle;

import java.util.Scanner;

public class Ex_2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		float num;
		
		System.out.print("Digite o número desejado: ");
		num = entrada.nextFloat();
		
			if (num>0) {
				System.out.println("O número " + num + " é positivo.");
			} else if (num <0) {
				System.out.println("O número " + num + " é negativo.");
			}else  {
				System.out.println("O número " + num + " é zero.");
			}
		
		entrada.close();
		

	}

}
