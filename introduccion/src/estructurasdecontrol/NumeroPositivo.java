package estructurasdecontrol;

import java.util.Scanner;

public class NumeroPositivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creamos un objerto de tipo Scanner
		Scanner entrada = new Scanner(System.in);
		
		//Introducimos un numero por pantalla
		System.out.println("Introduce un número");
		int num1 = entrada.nextInt();
		
		
		String mensaje= "El número "; 
		
		
		if (num1 > 0) {
			System.out.println(mensaje + num1 + " es positivo");
				}else if(num1<0) {
					System.out.println(mensaje + num1 + " es negativo");
					}else {
						System.out.println("El número es 0");
						}
		

	}

}
