package estructurasdecontrol;

import java.util.Scanner;

public class AccesoAplicacionWhile {
	 
	public static void main (String[] args) {
	
		String clave="Patricia";
		String pass="";
		
		while(clave.equals(pass)==false){
			
		System.out.println("Introduce la contrase�a: ");
		
		 	if(clave.equals(pass)==false) {
		 		
		 		System.out.println("Contrase�a incorrecta: ");
			
		  	}
			
		}
		
		System.out.println("Contrase�a correcta acceso permitido");
		
	}
	

}
