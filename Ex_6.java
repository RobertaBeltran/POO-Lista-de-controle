package Exercicio_Controle;

import java.util.Scanner;

public class Ex_6 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num, num2;
		
		System.out.print("Informe um número inteiro: ");
		num = entrada.nextInt();
		
		if (num%2==0) {
			num2 = num +1;
			System.out.println(num + " foi o número que você digitou, o mesmo é um número par, agora transformando ele em ímpar: " + num2);
		}else {
			num2 = num +1;
			System.out.println(num + " foi o número que você digitou, o mesmo é um número ímpar, agora transformando ele em par: " + num2);
		}
		
		entrada.close();
		
	}

}
