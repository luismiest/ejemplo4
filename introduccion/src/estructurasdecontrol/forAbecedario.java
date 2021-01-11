package estructurasdecontrol;

public class forAbecedario {

	public static void main(String[] args)
	{
		int tamAbc = 'Z'-'A'+1;
		for (char letra='A'; letra<='Z'; letra ++) {
			System.out.print(letra+"  ");
		}
		System.out.println("\n");
		
		
		for (int i='A'; i<='Z'; i++) {
			System.out.print(i+" ");
		}

	}

}
