package Exercicio_Controle;

import java.util.Scanner;

public class Ex_19 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int a, b, c;
		int delta = 0;
		int raiz1 = 0;
		int raiz2 = 0;
		
		System.out.print("Digite o número correspondente a A: ");
		a=entrada.nextInt();
		
		if (a ==0) {
			System.out.println("A equação não é do segundo grau");
		}else {		
			System.out.print("Digite o número correspondente a B: ");
			b=entrada.nextInt();
			
			System.out.print("Digite o número correspondente a C: ");
			c=entrada.nextInt();
			
			delta = (((b^2) - (4*a*c)));
			if (delta<0) {
				System.out.println("A equação não possui raizes reais. ");
			}else if (delta == 0) {
					System.out.println("A equação possui apenas uma raiz que é: ");
					raiz1 = ((-b)+(delta^(1/2))/(2*a));
					System.out.println(raiz1);
			}else if (delta>0) {
					raiz1 = ((-b)+(delta^(1/2))/(2*a));
					raiz2 = ((-b)-(delta^(1/2))/(2*a));
					System.out.println("A equação possui duas raizes que são: "+ raiz1 + " e " + raiz2);					
			}
		}
		entrada.close();
	
						

	}

}
