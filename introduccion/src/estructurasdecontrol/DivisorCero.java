package estructurasdecontrol;

import java.util.Scanner;

public class DivisorCero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		//Variables
		System.out.println("Introduce un número");
		double dividendo  = entrada.nextDouble();
		System.out.println("Introduce otro número");
		double divisor = entrada.nextDouble();
		
		
		
		if (divisor == 0 ) {
			System.out.println("ERROR, divisor no puede ser 0 ");
		}else {
			double resultado = dividendo / divisor;
			System.out.println("La division de " + dividendo + " entre " + divisor + " es igual a : " +resultado);
		}		
	} 

}
