package estructurasdecontrol;

import java.io.IOException;
import java.util.Scanner;
import java.io.InterruptedIOException;

public class TablaMultiplicar {

	public static void main (String[]args) throws IOException 
	{
		//TODO Auto-generated method stub 
		

		for(int i = 1; i<= 10; i ++)
		{
			System.out.println("Tabla del: " +i);
		
			for(int j = 1; j <= 10 ; j ++)
				
			System.out.println(i +"*"+ j);
		
		}
		
	}
}
