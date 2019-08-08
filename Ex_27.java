package Exercicio_Controle;

import java.util.Scanner;

public class Ex_27 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double num1,num2,resul=0;
		int op;
		
		System.out.println("Informe o 1º valor: ");
		num1=entrada.nextDouble();
		
		System.out.println("Informe o 2º valor: ");
		num2=entrada.nextDouble();
		
		System.out.println("O que você deseja fazer:");
		System.out.println("1 - Adição");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");
		op=entrada.nextInt();
		
		
		if (op==1) {
			resul = num1+num2;			
		}	else if(op==2) {
					resul = num1-num2;
			}	else if(op==3){
					resul= num1*num2;
				}	else if(op==4) {
						resul = num1/num2;
					}else {
						System.out.println("Operação inválida");
					}
		System.out.println("Resultado = " +resul);
		
		if (resul%2==0) {
			System.out.println("Número é par");
		}else {
			System.out.println("Número é ímpar");
		}
		
		if (resul<0) {
			System.out.println("Número é negativo");
		}else {
			System.out.println("Número é positivo");
		}
		

		float fracao = (float) (resul % 1.0f);

		if(fracao == 0.0f){
			System.out.println("Número é inteiro");
		}else{
		  System.out.println("Número é decimal");
			
		}
			
		entrada.close();
	}}


