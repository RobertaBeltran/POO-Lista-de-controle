package Exercicio_Controle;

import java.util.Scanner;

public class Ex_10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num1, num2,num3;
		
		System.out.print("Digite o primeiro número: ");
		num1=entrada.nextInt();
		
		System.out.print("Digite o segundo número: ");
		num2=entrada.nextInt();
		
		System.out.print("Digite o terceiro número: ");
		num3=entrada.nextInt();
		
			if (num1>num2 && num1>num3) {
				System.out.println("Dentre os números digitados o maior é: " + num1);
			}else if (num2>num1 && num2>num3) {
				System.out.println("Dentre os números digitados o maior é: " + num2);
			}else if (num3>num1 && num3>num2) {
				System.out.println("Dentre os números digitados o maior é: " + num3);
			}
			
			if (num1<num2 && num1<num3) {
				System.out.println("Dentre os números digitados o menor é: " + num1);
			}else if (num2<num1 && num2<num3) {
				System.out.println("Dentre os números digitados o menor é: " + num2);
			}else if (num3<num1 && num3<num2) {
				System.out.println("Dentre os números digitados o menor é: " + num3);
			}
			
		entrada.close();

	}

}
