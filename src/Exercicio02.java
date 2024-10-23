//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro 
//casas decimais conforme exemplos.
//Fórmula da área: area = π . raio2
//Considere o valor de π = 3.14159

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		System.out.print("Digite do raio:");
		double raio = sc.nextDouble();
		double pi = 3.14159;
		double area = pi * Math.pow(raio, 2);
		
		System.out.printf("Area = %.4f%n", area);
		
		
		sc.close();

	}

}
