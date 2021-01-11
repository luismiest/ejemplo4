package programacionmodular;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) 
	{
		//Pedimos el número
		int num = pedirNumero();
		// Calculamos el factorial
		
		int factorial = calcularfactorial(num);
		//Enviamos a pantalla los resultados
		verResultados(num, factorial);
		
	}
	//////////////////////////////////////////////
	public static int pedirNumero()
	{
		System.out.println("Introduce el numero: ");
		Scanner entrada = new Scanner (System.in);		
		
		return entrada.nextInt();
		
	}
	//////////////////////////////////////////////
	
	public static int calcularfactorial(int num)
	{
	//Acumulador
	int factorial = 1;
	for(int i = num; i >=1; i--)
		factorial = factorial * i;
		
		
	return factorial;
		
	}
	////////////////////////
	public static void verResultados(int num, int factorial)
	{
	System.out.println("El factorial de " + num + " es " + factorial);
		
		
	}
}
