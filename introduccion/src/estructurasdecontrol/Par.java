// Tenemos que introducir una variable, un número y decir sii es par
package estructurasdecontrol;

import java.util.Scanner;

public class Par {

	public static void main(String[] args) {
		//introduzco por teclado el número
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un número entero: ");
		int num = entrada.nextInt();
		//comprobamos si es par
		if(num % 2 == 0)
			System.out.println(num + " es par");
		else 
			System.out.println(num + " es impar");

	}

}
