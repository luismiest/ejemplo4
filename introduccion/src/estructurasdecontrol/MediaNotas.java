/*Introduce por teclado un conjunto de notas
 * hasta que teclea el flag o bandera -99
 * visualizando en pantalla la nota media
 * La nota es válida si está comprendida
 * entre 1 y 10.
 * En caso contrario, deberá indicar que no es
 * válida la nota y volver a pedirla.
 */

package estructurasdecontrol;

import java.util.Scanner;

public class MediaNotas 
{

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		//variable que controla la salida del bucle
		boolean salir = false;
		//contador de notas o alumnos
		float sumaNotas = 0;
		int contadorNotas = 0;
		float nota = 0;
		//pedimos la nota
		System.out.println("Introduce la nota,teclea -99 para salir.");
		do{ 
			nota = entrada.nextFloat();
			
			
			//comprobamos si ha introducido un -99
			/*if(nota == -99)
				salir = true*/
			//lo mismo que lo anterior sería
			salir = (nota == -99);
			boolean notaValida = (nota > 0 && nota <= 10);
					
					
			if(!salir && notaValida)
			{
				sumaNotas = sumaNotas + nota;
				contadorNotas++;
			} else if (!salir) {
				System.out.println("Error: la nota no es valida");
			}
			
		}while (!salir);
		if(contadorNotas > 0)
		{
			float media = sumaNotas / contadorNotas;
			//Calculamos la nota media
			
			//Enviamos a pantalla el resultado
			System.out.println("La nota media es " + media);
			
		}
		else
			System.out.println("No ha introducido ninguna nota");
		System.out.println("Fin de programa");
	}

}
