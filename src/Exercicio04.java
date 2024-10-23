//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por 
//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas 
//decimais.

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número do Funcionário:");
		int numeroFunc = sc.nextInt();
		System.out.print("Digite as horas trabalhadas:");
		int horaTrab = sc.nextInt();
		System.out.print("Digite o valor da hora:");
		double valorHora = sc.nextDouble();
		double salario = horaTrab * valorHora;
		
		System.out.printf("NUMBER = %d%n"
				+ "SALARY = U$ %.2f",
				numeroFunc, salario);
		
		sc.close();
	}

}
