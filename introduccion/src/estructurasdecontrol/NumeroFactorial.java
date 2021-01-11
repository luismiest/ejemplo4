package estructurasdecontrol;

import java.util.Scanner;

public class NumeroFactorial {

	public static void main(String[] args) 
	{
       Scanner entrada = new Scanner(System.in);
       System.out.println("Introduce un número:");
       int numero = entrada.nextInt();
       int factor = 1;
       
       for (int i = numero; i > 0; i--) 
       {
    	   factor = factor *i;
       }
       System.out.println("El factorial de " +numero+ " es: " +factor);
       
	}
}
