package exercicios2703;
import java.util.ArrayList;
import java.util.Scanner;
public class somadosnumerosinteiros {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner (System.in);
		ArrayList<Integer> numeros = new ArrayList<>();
		System.out.println("Digite números inteiros (digite '0' para finalizar):");
		while (true) {
		int numero = Scanner.nextInt();
		if (numero == 0) {
		break;
		}
		numeros. add (numero);
		}
		int soma = somarNumeros (numeros);
		System.out.println("A soma de todos os números é: " + soma);
		}
		public static int somarNumeros (ArrayList<Integer> numeros) {
		int soma = 0;
		for (int numero : numeros) {
		soma += numero;
		}
		return soma;
		}

}
