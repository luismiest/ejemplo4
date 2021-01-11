/*Convierte una nota alfabetica a numerica 
 * utilizando la estructura Switch
 * 
 */
package estructurasdecontrol;

import java.io.IOException;

public class ConversorNotaSwitch {
	public static void main(String args[]) throws IOException
	{
		//introducimos por teclado la nota
		System.out.println("introduce la nota alfabetica:");
		char notaAlfab = (char) System.in.read();
		//declaramos una nota numerica 
		int notaNumerica = 0; 
		//variable logica para comprobar si la nota es correcta
		boolean notaCorrecta = true;
		
		//convertimos la nota alfabetica a numerica 
		switch(notaAlfab)
		{
		  case 'I':
			notaNumerica = 4;
			break;
		  case 'F':
			notaNumerica = 5;
			break;
		  case 'B':
			notaNumerica = 6;
			break;
		  case 'N':
			notaNumerica = 7;
			break;
		  case 'S':
			notaNumerica = 9;
			break;
		  default:
			System.out.println("la nota no es correcta"); 
			notaCorrecta = false;
			
			break;
			
				
		
		}
		//comprobamos si la nota es correcta
		if(notaCorrecta)
		{
			//enviamos a pantalla 
			System.out.println("la nota numerica es " + notaNumerica);
		}
		
		
	}
	
}
