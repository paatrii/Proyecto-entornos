package estructurasdecontrol;

import java.util.Scanner;

public class AccesoAplicacionWhile {
	 
	public static void main (String[] args) {
	
		String clave="Patricia";
		String pass="";
		
		while(clave.equals(pass)==false){
			
		System.out.println("Introduce la contraseņa: ");
		
		 	if(clave.equals(pass)==false) {
		 		
		 		System.out.println("Contraseņa incorrecta: ");
			
		  	}
			
		}
		
		System.out.println("Contraseņa correcta acceso permitido");
		
	}
	

}
