package exercicios2703;
import java.util.Scanner;
public class desafio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		String cpf , senha;
		double valor, saldof;

		System.out.println("Digite seu cpf");
		cpf = ler.nextLine ();

		if (cpf.equals("482345678")) {
			System.out.println("Digite sua senha");
			senha = ler.nextLine ();
			if (senha.equals("12345678")) {
				System.out.println("Seu saldo é 150");
				System.out.println("Qual valor deseja sacar?");
				valor = ler.nextDouble();
				if (valor <= 200) {
					saldof = 200 - valor;
					System.out.println("saldo atualizado,valor correspondente é" + saldof);
				}else {
					System.out.println("saldo insuficiente");}
			}else {

				System.out.println("senha incorreta");}
		}else {
			System.out.println("cpf incorreto");
		} ler.close ();
	}
}