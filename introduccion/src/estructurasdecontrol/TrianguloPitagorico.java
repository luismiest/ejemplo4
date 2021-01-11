package estructurasdecontrol;

import java.io.IOException;
import java.util.Scanner;

public class TrianguloPitagorico {

	public static void main(String[] args) throws IOException
	{
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un caracter");
		char car = (char)System.in.read();
		System.out.println("Introduce la altura");
		int altura = entrada.nextInt();
		
		for(int linea=1; linea <= altura; linea++) 
		{
			for(int contCa=1; contCa<=linea; contCa++ )
			{
				System.out.print(car);
			}
			System.out.println();
		}
		

	}

}
