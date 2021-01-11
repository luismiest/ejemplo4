package programacionmodular;

import java.util.Scanner;

public class Mcd {

	public static void main(String[] args) {
	        Scanner teclado= new Scanner(System.in);
	        int num1,num2;
	        System.out.println("Introduce el primer numero: ");
	        num1=teclado.nextInt();
	        System.out.println("Introduce el segundo numero: ");
	        num2=teclado.nextInt();
	        
	        while(num1 != num2)
	            if(num1>num2)
	                num1= num1-num2;
	            else
	                num2= num2 -num1;
	        System.out.println("El MCD es:" +num1);
	}

}
