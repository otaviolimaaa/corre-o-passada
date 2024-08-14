package exercicios2703;

import java.util.Scanner;

public class desafio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner ler = new Scanner (System.in);
		
		int mes;
		
		System.out.println("Digete o numero do mes");
		mes = ler.nextInt();
		
		if (mes == 1) {
			System.out.println("O mes é janeiro");
		}
		if (mes == 2) {
			System.out.println("O mes é fevereiro");
		}
		if (mes == 3) {
			System.out.println("O mes é março");
		}		
		if (mes == 4) {
			System.out.println("o mes é abril");
		}
		if (mes == 5) {
			System.out.println("o mes é maio");
		}
	if (mes == 6) {
			System.out.println("O mes é junho");
		}
		if (mes == 7){
			System.out.println("O mes é julho");

		}
		if (mes == 8){
			System.out.println("O mes é agosto");
		}
	if (mes == 9){
			System.out.println("O mes é setembro");
		}
	if (mes == 10){
			System.out.println("O mes é outubro");
		}
		if (mes == 11){
			System.out.println("O mes é novembro");
		}
		else if (mes == 12){
			System.out.println("O mes é dezembro");
		}
		else if (mes > 12){
			System.out.println("O mes não existe");
		}
		else if (mes < 1){
			System.out.println("O mes não existe");
		}
		ler.close();
	}

}
