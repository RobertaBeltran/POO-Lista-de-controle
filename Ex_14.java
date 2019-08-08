package Exercicio_Controle;

import java.util.Scanner;

public class Ex_14 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num;
		
		System.out.print("Digite um número inteiro: ");
		num= entrada.nextInt();
		
		if (num==1) {
			System.out.println("1 - Domingo");
		}else if (num==2) {
			System.out.println("2 - Segunda");
		}else if (num==3) {
			System.out.println("3 - Terça");
		}else if (num==4) {
			System.out.println("4 - Quarta");
		}else if (num==5) {
			System.out.println("5 - Quinta");
		}else if (num==6) {
			System.out.println("6 - Sexta");
		}else if (num==7) {
			System.out.println("7 - Sábado");
		}else {
			System.out.println("Número inválido!");
		}
		
		entrada.close();

	}

}
