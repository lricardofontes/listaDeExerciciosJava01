//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma 
//mensagem explicativa, conforme exemplos

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero:");
		int numero1 = sc.nextInt();
		System.out.print("Digite o segundo numero:");
		int numero2 = sc.nextInt();
		int soma = numero1 + numero2;
		
		System.out.printf("SOMA = %d%n", soma);
		
		
		sc.close();

	}

}
