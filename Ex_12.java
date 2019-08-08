package Exercicio_Controle;

import java.util.Scanner;

public class Ex_12 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double salarioAntigo,salarioNovo,valorAumento,percentual;
		
		System.out.print("Informe o seu salário: ");
		salarioAntigo = entrada.nextDouble();
		
		if (salarioAntigo <= 280.00) {
			percentual = 0.2;
			valorAumento = salarioAntigo * percentual;
			salarioNovo = salarioAntigo + valorAumento;
			percentual = percentual * 100;
			System.out.println("Seu salário antigo: R$ " + salarioAntigo);
			System.out.println("Percentual de aumento aplicado: " + percentual + " % ");
			System.out.println("O valor do aumento: R$ " + valorAumento);
			System.out.println("Seu novo salário: R$ " + salarioNovo);
			
		}else if (salarioAntigo>280.00 && salarioAntigo<=700.00) {
			percentual = 0.15;
			valorAumento = salarioAntigo * percentual;
			salarioNovo = salarioAntigo + valorAumento;
			percentual = percentual * 100;
			System.out.println("Seu salário antigo: R$ " + salarioAntigo);
			System.out.println("Percentual de aumento aplicado: " + percentual + " % ");
			System.out.println("O valor do aumento: R$ " + valorAumento);
			System.out.println("Seu novo salário: R$ " + salarioNovo);
			
		}else if (salarioAntigo>700.00 && salarioAntigo<=1500.00) {
			percentual = 0.1; 
			valorAumento = salarioAntigo * percentual;
			salarioNovo = salarioAntigo + valorAumento;
			percentual = percentual * 100;
			System.out.println("Seu salário antigo: R$ " + salarioAntigo);
			System.out.println("Percentual de aumento aplicado: " + percentual + " % ");
			System.out.println("O valor do aumento: R$ " + valorAumento);
			System.out.println("Seu novo salário: R$ " + salarioNovo);
			
		}else if (salarioAntigo>1500.00) {
			percentual = 0.05;
			valorAumento = salarioAntigo * percentual;
			salarioNovo = salarioAntigo + valorAumento;
			percentual = percentual * 100;
			System.out.println("Seu salário antigo: R$ " + salarioAntigo);
			System.out.println("Percentual de aumento aplicado: " + percentual + " % ");
			System.out.println("O valor do aumento: R$ " + valorAumento);
			System.out.println("Seu novo salário: R$ " + salarioNovo);
		}
		
		
		entrada.close();		

	}

}
