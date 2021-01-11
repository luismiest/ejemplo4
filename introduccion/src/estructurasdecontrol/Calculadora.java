package estructurasdecontrol;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int opcion=1;
		double num1=0;
		double num2=0;
		double result=0;
		boolean salir = false;
		
		do{
					
				System.out.println("1 Suma");
				System.out.println("2 Resta");
				System.out.println("3 Multiplicaci�n");
				System.out.println("4 Divisi�n");
				System.out.println("5 Salir");
					
				System.out.println("Introduzca la operaci�n a realizar:");
				boolean entre1y5;
				do
				{
					opcion=entrada.nextInt();
					entre1y5=(opcion>=1 && opcion<=5);
					if(!entre1y5) 
					{
						System.out.println("Error! el operador elegido no se encuentra entre 1 y 5");
					}
				}while(!entre1y5);
				
				salir = (opcion==5);
					
				if(!salir) 
				{
					System.out.println("Introduzca numero 1:");
					num1=entrada.nextDouble();
					System.out.println("Introduce numero 2:");
					num2=entrada.nextDouble();
					
					switch(opcion)
					{
						case 1:
							result=num1+num2;
							break;
						case 2:
							result=num1-num2;
							break;
						case 3: 
							result=num1*num2;	
							break;
						case 4: 
							if(num2==0) {
							System.out.println();
							
							}else {
								result=num1/num2;
								}
							break;
					}	
				}
				
				if(opcion==4 && num2==0) 
				{
					System.out.println("No se puede dividir por cero elija otra operaci�n");
				}else if(salir) 
				{		
					System.out.println("Hasta pronto.");
				}else
					System.out.println("El resultado de tus operacion es: " + result );
					
				}while(!salir);
				
			
				 
					System.out.println("Programa finalizado!");
				
				
		
		
		
	}

}
