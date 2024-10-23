//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o 
//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codPeca1, codPeca2, qtdPeca1, qtdPeca2;
		double valorPeca1, valorPeca2, valorPagar;
		
		codPeca1 = sc.nextInt();
		qtdPeca1 = sc.nextInt();
		valorPeca1 = sc.nextDouble();
		codPeca2 = sc.nextInt();
		qtdPeca2 = sc.nextInt();
		valorPeca2 = sc.nextDouble();
		valorPagar = (qtdPeca1*valorPeca1)+(qtdPeca2*valorPeca2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", valorPagar);
		
		sc.close();

	}

}
