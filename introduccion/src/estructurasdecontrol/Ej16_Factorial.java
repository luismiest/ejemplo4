package estructurasdecontrol;

import java.util.Scanner;

public class Ej16_Factorial {

	public static void main(String[] args) {
		
		//que visualice en pantalla el factorial de un número.
		//factorial de un num = ese num x los anteriores (3=3*2*1)
		
		
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce un número");
		int num=entrada.nextInt();
		
		int factorial=1;
		
		for (int cont=num; cont>0; cont--) 
		{
			
			factorial=factorial*cont;
			
		} 
		System.out.println("factorial de " + num + " = " + factorial);
		
	}

}