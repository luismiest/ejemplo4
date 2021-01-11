package examen1ºtrimestre;

import java.util.Scanner;

public class MaxMInBoolean 
{
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("introduce el valor mínimo.");
		int min = entrada.nextInt();
		System.out.println("introduce el valor máximo:");
		int max = entrada.nextInt();
		System.out.println("introduce el valor:");
		boolean dentroRango;
		int num;
		do {
			num = entrada.nextInt();
			dentroRango = (num >= min && num <= max);
			if(!dentroRango)
				System.out.println("Error: el número está fuera del rango");
			
		}while(!dentroRango);
		System.out.println("fin de programa");	
	}
}