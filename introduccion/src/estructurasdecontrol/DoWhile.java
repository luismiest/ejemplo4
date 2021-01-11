
/*Introduce por teclado una respuesta válida. La respuesta valida
 *  cuando sea una s miniscula o una n minúscula
 */
package estructurasdecontrol;

import java.io.IOException;

public class DoWhile {

	public static void main(String[] args) throws IOException 
	{
	  char respuesta;
	  System.out.println("Introduce la respuesta:");
	  do {
		   respuesta = (char)System.in.read();
		   respuesta = Character.toLowerCase(respuesta);
		   //Limpiamos el buffer de teclado
		  System.in.skip(2);
		   if(respuesta != 's' && respuesta != 'n')
			   System.out.println("error:teclea una s o una n");
		  
	  }while(respuesta != 's' && respuesta != 'n');
	  
	  System.out.println("fin de programa");
	

	}

}
