package exercicios2703;

import java.util.Scanner;

public class Desafio2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);

		int numero;

		System.out.println("Digite um numero");
		numero = ler.nextInt();

		if (numero <0){
			System.out.println("O numero positivo");
		}
		if (numero >0){
			System.out.println("O numero negativo");
		}
		ler.close();
	}

}
