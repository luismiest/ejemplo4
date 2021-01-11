package estructurasdecontrol;
import java.util.Scanner;
public class CalculadoraMatias {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float num1;
		float num2;
		float resultado = 0;
		int eleccion;
		boolean salir = false;
		do {
			System.out.println("1.Suma");
			System.out.println("2.Resta");
			System.out.println("3.Multiplicacion");
			System.out.println("4.Division");
			System.out.println("5.Salir del programa");
			System.out.print("Elija la opcion: ");
			eleccion = entrada.nextInt();
			while(eleccion < 1 || eleccion > 5) {
				System.out.println("Error, elija un valor entre 1 y 5:");
				eleccion = entrada.nextInt();
			}
			salir = (eleccion == 5);
			if(!salir) {
				System.out.println("Indique los numeros: ");
				num1 = entrada.nextInt();
				num2 = entrada.nextInt();
				while(eleccion == 4 && num2 == 0) {
					System.out.println("El segundo numero no puede ser 0 al intentar realizar una division, indique otro: ");
					num2 = entrada.nextInt();
				}
				switch(eleccion) {
				case 1: resultado = num1 + num2;
						break;
				case 2: resultado = num1 - num2;
						break;
				case 3: resultado = num1 * num2;
						break;
				case 4: resultado = num1 / num2;
						break;
				}
				System.out.println("El resultado es: " + resultado);
				System.out.println();
			}
		}while(!salir);
		System.out.println("Que tenga un buen dia.");
		entrada.close();
	}
}
