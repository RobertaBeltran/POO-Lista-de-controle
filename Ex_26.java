package Exercicio_Controle;

import java.util.Scanner;

public class Ex_26 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num;
		
		System.out.print("Informe um número inteiro: ");
		num = entrada.nextInt();
		
		if (num%2==0) {
			
			System.out.println(num + " foi o número que você digitou, o mesmo é um número par");
		}else {
			
			System.out.println(num + " foi o número que você digitou, o mesmo é um número ímpar " );
		}
		
		entrada.close();
	}

}
