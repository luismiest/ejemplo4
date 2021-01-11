package programacionmodular;

import java.util.Scanner;

public class Potencia {
	public static void main(String args[]) {
		System.out.println("Introduce la base");
		int base = pedirNumero();
		System.out.println("Introduce el exponente");
		int expo = pedirNumero();
		int calc = calcularPotencia(base, expo);
		verResultado (base, expo, calc);
	}
	/////////////////////////////////////////////////////
	public static int pedirNumero() {
		Scanner entrada = new Scanner (System.in);
		return entrada.nextInt();
	}
	////////////////////////////////////////////////////
	public static int calcularPotencia(int base, int expo) {
		int resultado = 1;
		for (int i = 1; i <= expo; i++) {
			resultado = resultado * base;
		}
		return resultado;
	}
////////////////////////////////////////////////////
	public static void verResultado(int base, int expo, int calc) {
		System.out.println(base + " elevado a " + expo + " = " + calc);
	}
}
