package estructurasdecontrol;

import java.io.IOException;

public class CuentaPalabrasAlonso {

	public static void main(String[] args) throws IOException {
		//Tenemos que introducir una frase por teclado y nos tiene que contar cuantos espacios ocupa
		//la frase debe terminar al introducir un '.'
		//	La insoportable levedad del ser.
		System.out.println("Introduce la frase: ");
		//Variables- Las inicializamos a 0
		boolean salir = false;
		int totalCaracteres = 0;
		int totalEspacios = 0;
		int totalPalabras = 0;
		do 
		{
			//introducimos por teclado la frase
			char frase = (char)System.in.read();
			
			//comprobamos si el caracter es el'.' para salir
			salir = (frase == '.');
			
			//contamos el total de carácteres introducidos haciendo que sume cada vez que pase por el bucle
			totalCaracteres++;
			
			//contamos el numero de palabras sabiendo cuantos espacios hay	
			totalPalabras = totalEspacios + 1;
			
			if(frase =='.' && totalCaracteres == 1) {
				totalPalabras = totalPalabras -1;
			}
			//contamos el numero de espacios que introduce el ususario para saber el numero de palabras que introduce
			else if(frase ==' ')
				totalEspacios++;
			
		}while(!salir);	
		//informamos al ususario del total de carácteres introducidos.
		System.out.println("La frase contiene " + totalCaracteres + " Caracteres.");
		System.out.println("La frase contiene " + totalEspacios  + " espacios.");
		System.out.println("La frase contiene " + totalPalabras  + " palabras.");
		System.out.println();
		System.out.println("Fin de programa, Goodbye.");
	}

}
