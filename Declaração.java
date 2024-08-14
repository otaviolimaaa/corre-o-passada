package exercicios2703;
public class Declaração {

	public static void main(String[] args) {
		var f = 109.0;
		final var fc = 32.0;
		final var cc = 5.0/9.0;
		var c = ((f-fc)* (cc));
		
		System.out.println("A temperatura de feherenheit é" + f + "A temperatura em celcius é" + c);
	}

}
