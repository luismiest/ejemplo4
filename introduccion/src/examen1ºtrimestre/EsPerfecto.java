package examen1ºtrimestre;

import java.util.Scanner;

public class EsPerfecto {

	public static void main(String[] args)
	{
		int num = pedirNum();
		if(esPerfecto(num))
			System.out.println(num + " es perfecto");
		else
			System.out.println(num + " no es perfecto");
	}
	public static int pedirNum()
	{
		Scanner entrada = new Scanner(System.in);
		System.out.println("introduce un número entero:");
		return entrada.nextInt();
	}
	public static boolean esPerfecto(int num)
	{
		int suma = 0;
		for(int i = 1; i <= num/2; i++)
		{
			if(num % i == 0)
				suma = suma + i;
		}
		if( suma == num)
			return true;
		return false;		
	}
}