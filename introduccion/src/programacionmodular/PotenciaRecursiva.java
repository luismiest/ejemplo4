package programacionmodular;

import java.util.Scanner;

public class PotenciaRecursiva {
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
	/////////////////////////////////////////////////////
	
	////////////////////////////////////////////////////
	public static int calcularPotencia(int base, int expo) {
		if(expo == 0)
			return 1;
		
		return base * calcularPotencia(base, expo - 1);
	}
////////////////////////////////////////////////////
	public static void verResultado(int base, int expo, int calc) {
		System.out.println(base + " elevado a " + expo + " = " + calc);
	}
}
