package estructurasdecontrol;

import java.io.*;
 public class Enter
 {
 	public static void main (String args[]) throws IOException
	{
	
		System.out.println ("Introduce frase(enter para terminar):");
		
		char car = (char) System.in.read();
		
	
		while(car!= '\n')
		{
			System.out.print(car);
			car=(char)System.in.read();
		}
		//fin mientras
		
		
	}//fin main
	 
 }//fin class
 