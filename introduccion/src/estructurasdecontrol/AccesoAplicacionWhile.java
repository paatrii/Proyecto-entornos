package estructurasdecontrol;

import java.util.Scanner;

public class AccesoAplicacionWhile {
	 
	public static void main (String[] args) {
	
		String clave="Patricia";
		String pass="";
		
		while(clave.equals(pass)==false){
			
		System.out.println("Introduce la contraseña: ");
		
		 	if(clave.equals(pass)==false) {
		 		
		 		System.out.println("Contraseña incorrecta: ");
			
		  	}
			
		}
		
		System.out.println("Contraseña correcta acceso permitido");
		
	}
	

}
