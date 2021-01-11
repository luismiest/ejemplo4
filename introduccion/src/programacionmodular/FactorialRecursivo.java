package programacionmodular;

import java.util.Scanner;

public class FactorialRecursivo {

		public static void main(String[] args) 
		{
			int numero=pedirNumero();
			int factorial= calcularFactorial(numero);
			verResultado(numero,factorial);
		}
		public static int pedirNumero()
		{
			Scanner entrada = new Scanner(System.in);		
			System.out.println("Dime un numero");
			return entrada.nextInt();
		}
		public static int calcularFactorial(int num)
		{
			if(num == 0)
				return 1;
			return num * calcularFactorial(num - 1);
				
		}
		public static void verResultado(int numero,int factorial)
		{
		System.out.println("El factorial de " + numero + " es " + factorial);
		}
}
