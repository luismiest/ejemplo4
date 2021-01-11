
/*Introduce por teclado una respuesta válida. La respuesta valida
 *  cuando sea una s miniscula o una n minúscula
 */
package estructurasdecontrol;

import java.io.IOException;

public class DoWhileVersionDos {

	public static void main(String[] args) throws IOException 
	{
	  boolean respuestaValida = true;
		char respuesta;
	  System.out.println("Introduce la respuesta:");
	  do {
		   respuesta = (char)System.in.read();
		 //Limpiamos el buffer de teclado
		  System.in.skip(2);
		   respuesta = Character.toLowerCase(respuesta);
		 //Comprobamos si la respuesta es válida.
		   respuestaValida = (respuesta == 's' || respuesta == 'n');
		  
		   if(!respuestaValida)
			   System.out.println("error:teclea una s o una n");
		  
	  }while(!respuestaValida);
	  
	  System.out.println("fin de programa");
	

	}

}
