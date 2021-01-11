/*
 * Introducimos por teclado la base y el exponente y conseguimos
 * la potencia.
 */
package estructurasdecontrol;

import java.util.Scanner;

public class Potencia {

	public static void main(String[] args)
	{
		//Introducimos la base y el exponente.
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introducimos la base: ");
		int base = entrada.nextInt();
		System.out.println("Introducimos el exponente: ");
		int exponente = entrada.nextInt();
		
		//Calculamos la potencia
		//Inicializamos el acumulador
		int resultado = 1;
		for(int i =1; i <= exponente; i++)
			resultado = resultado * base;
		//Enviamos a pantalla el resultado
		System.out.println("El resultado es = " + resultado);
		
			
	}

}
