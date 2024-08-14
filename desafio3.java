package exercicios2703;

import java.util.Scanner;

public class desafio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);

		int numero;

		System.out.println("Digite um numero");
		numero = ler.nextInt();
		
		if (numero % 2==0) {
			System.out.println("O numero é par");
		}
		else {
			System.out.println("O numero é impar");
			
		}

	}

}
