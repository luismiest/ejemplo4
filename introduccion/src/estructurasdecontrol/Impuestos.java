package estructurasdecontrol;

import java.util.Scanner;

public class Impuestos {

	/*programa que calcule el tipo impuestivo
	 * 
	 */
	public static void main(String[] args)
	{
		// declaramos un objeto de tipo Scanner
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu renta anual");
		//variables necesarias
		int renta = entrada.nextInt();
		int impuesto;
		if(renta <= 0)
			System.out.println("la renta tiene que ser mayor que 0");
		else {
			if(renta < 10000)
				impuesto = 5;
		else if (renta < 20000)
				impuesto = 15;
		else if (renta < 35000)
				impuesto = 20;
		else if (renta < 60000)
				impuesto = 30;
		else
				impuesto = 45;
		System.out.println("El tipo impositivo es " + impuesto + "%");
		}
		
		
	
			
	}
}