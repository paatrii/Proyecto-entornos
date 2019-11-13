package estructurasdecontrol;

import java.util.Scanner;

public class PesoIdealDoWhile {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		char genero;
		
		do {
			
			System.out.println("Introduce tu género: ");
			
		
		}while(genero != 'H' && genero != 'M');
		System.out.println("Introduce altura en cm: ");
		int altura=entrada.nextInt();
		int pesoideal=0;
		
		if (genero != 'H' && genero != 'M');{
			
			pesoideal=altura-110;
			
		}
		
		else if (genero != 'H' && genero != 'M');
		{
			
			pesoideal=altura-120;
			
		}
		System.out.println("Tu peso ideal es" +pesoideal +"");
	
	}
}
