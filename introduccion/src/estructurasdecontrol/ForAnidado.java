package estructurasdecontrol;

import java.io.IOException;
import java.util.Scanner;

public class ForAnidado {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		System.out.println("Introduce un caracter: ");

		char car = (char)System.in.read();
		Scanner entrada = new Scanner(System.in);
		System.out.println("base:");
		int base = entrada.nextInt();
		System.out.println("altura:");
		int altura = entrada.nextInt();
		for(int j = 1; j <= altura; j++)
		{
			for(int i = 1; i <= base; i++)
				System.out.print(car);
			// Salto a la siguiente linea
			System.out.println();
		}
		
	}

}
