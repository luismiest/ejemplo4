package estructurasdecontrol;

import java.util.Scanner;

public class ConjuntoNumeros 
{
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		//inicializamos los contadores
		int menores15 = 0;
		int mayores55 = 0;
		int entre45y55 = 0;
		
		System.out.println("¿Dime el numero?");	
		for (int cont = 1; cont <= 6; cont++)
		{	
			int num = entrada.nextInt();
			if (num < 15)
			{
				menores15++;
			}
			else if	(num > 55)
			{
				mayores55++;
			}
			else if (num >= 45)
			{
				entre45y55++;
			}
		
		}
		System.out.println( "Numeros menores de 15:" + menores15 );
		System.out.println( "Numeros mayores de 55:" + mayores55 );
		System.out.println( "Numeros entre 45 y 55:" + entre45y55 );
	}

}
