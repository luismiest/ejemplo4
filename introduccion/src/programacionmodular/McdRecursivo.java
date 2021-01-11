package programacionmodular;

import java.util.Scanner;

public class McdRecursivo {
	public static void main(String[] args) {
		int numero1 = pedirNumero1();
		int numero2 = pedirNumero2();
		int mcd = calcularMcd(numero1, numero2);
		verResultado(numero1, numero2, mcd);
	}
	public static int pedirNumero1() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el primer número: ");
		return entrada.nextInt();
	}
	public static int pedirNumero2() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el segundo número: ");
		return entrada.nextInt();
	}
	public static int calcularMcd(int numero1, int numero2) {
		if(numero1 == numero2) {
			return numero1;
		}else if (numero1 > numero2) {
				return calcularMcd(numero1-numero2, numero2);
			}else {
				return calcularMcd(numero1, numero2-numero1);
			}
		
	}
	public static void verResultado(int numero1, int numero2, int mcd) {
		System.out.println("El MCD de " + numero1 + " y " + numero2 + " es: " + mcd);
	}
}