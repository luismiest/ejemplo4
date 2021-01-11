package estructurasdecontrol;
import java.io.IOException;
public class PalabrasMatias {

	public static void main(String[] args) throws IOException {
		char cadena;
		boolean salir = false;
		int contador = 0;
		System.out.println("Escriba una frase terminada en punto:");
		boolean empiezaPalabra = false;
		do {
			cadena = (char)System.in.read();
			salir = (cadena == '.');
			if(!empiezaPalabra && cadena != '.' && cadena != ' ' && cadena != '\n' && cadena != '\t') {
				empiezaPalabra = true;
				contador++;
			}
			if(cadena == ' ' || cadena == '\n' || cadena == '\t') {
				empiezaPalabra = false;
			}
		}while (!salir);
		System.out.println("La frase tiene " + contador + " palabras.");
	}

}
