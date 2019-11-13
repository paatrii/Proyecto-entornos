package estructurasdecontrol;

import java.util.Scanner;

public class forAbecedario {
	
	public static void main(String[] args)
	{
		int tamAbc = 'Z' - 'A' +1;
		for (char letra= 'A'; letra<='Z' ; letra ++) {
			System.out.println(letra+" ");
		}
		System.out.println("\n\n");
		
		for (int i= 'A'; i<='Z'; i++) {
			System.out.println(i+ " ");
		}
	}
}