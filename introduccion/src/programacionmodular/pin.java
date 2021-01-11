///Pedir pin por teclado intentos = 3
package programacionmodular;

import java.util.Scanner;

public class pin {

	public static void main(String[] args) 
	{
		//Creamos un programa para meter el codigo pin tres veces
		Scanner reader = new Scanner(System.in);
		int clave = 123;
		int num;
		boolean pinCorrecto;
		int contadorPIN = 0;
		do {
			System.out.println("Introduce la clave PIN: ");
			num = reader.nextInt();
			pinCorrecto = num == clave;
			if(!pinCorrecto) 
			{
				System.out.println("ERROR, PIN incorrecto");
				contadorPIN++;
			}
			
		}while(!pinCorrecto && contadorPIN <=3);
		if(contadorPIN >3) 
		{
			System.out.println("Numero de intentos superados");
		}
		else 
		{
			System.out.println("PIN Correcto.");
		}
	}

}