package programacionmodular;

import java.util.Scanner;

public class dia_mes_año {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		int mes = pedirMes();
		int anno = pedirAnno();
		int dia;
		boolean diaValido;
		do {
			dia = pedirDia();
			diaValido = validarDia(dia, mes, anno);
		}while(!diaValido);
		imprimirFecha(dia, mes, anno);
		

	}
	
	///////////////////////////////////////////////////
	
	public static int pedirMes(){
		boolean mesValido = false;
		int mes;
		System.out.println("Introduce el mes");
		do {
			mes = entrada.nextInt();
			mesValido = (mes>=1 && mes<=12);
			if(!mesValido) {
				System.out.println("ERROR. Introduce un mes correcto (entre 1 y 12)");
			}
		}while(!mesValido);
		return mes;
	}
	
	///////////////////////////////////////////////////

	public static int pedirAnno(){
		boolean annoValido;
		int anno;
		System.out.println("Introduce un año");
		do {
			anno = entrada.nextInt();
			annoValido = (anno >= 1582);
			if(!annoValido) {
				System.out.println("ERROR. Introduce un año correcto (mayor o igual que 1582)");
			}
		}while(!annoValido);
		return anno;
	}
	///////////////////////////////////////////////////

	public static int pedirDia(){
		System.out.println("Introduce el día");
		return entrada.nextInt();
		
	}
	///////////////////////////////////////////////////

	public static boolean validarDia(int dia, int mes, int anno){
		boolean diaValido = false;
		switch(mes)
		{
			case 4:
			case 6:
			case 9:
			case 11:
				diaValido = (dia>1 && dia<=30);
				if(!diaValido) {
					System.out.println("ERROR. Introduce un día valido entre 1 y 30");
				}
				break;
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				diaValido = (dia>1 && dia<=31);
				if(!diaValido) {
					System.out.println("ERROR. Introduce un día valido entre 1 y 31");
				}
				break;
			case 2:
				if(esBisiesto(anno)) {
					diaValido = (dia>1 && dia<=29);
					if(!diaValido) {
						System.out.println("ERROR. Introduce un día valido entre 1 y 29");
					}
				}else {
					diaValido = (dia>1 && dia<=28);
					if(!diaValido) {
						System.out.println("ERROR. Introduce un día valido entre 1 y 28");
					}
				}
				
		}
		return diaValido;
		
	}
	///////////////////////////////////////////////////

	public static boolean esBisiesto(int anno) {
		return ((anno%4 == 0)&&(anno%100!=0)||(anno%400==0));
	}
	///////////////////////////////////////////////////

	public static void imprimirFecha(int dia, int mes, int anno) {
		System.out.println("La fecha es " + dia + "/" + mes + "/" + anno);
	}

}
