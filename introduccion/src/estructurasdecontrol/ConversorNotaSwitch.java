/*covierte una alfabetica a numerica 
 * utilizando la estructura Switch
 */
package estructurasdecontrol;

import java.io.IOException;


public class ConversorNotaSwitch {
	
	public static void main(String args[])throws IOException
	{
	
	//Introducimos por teclado la nota alfabetica
	System.out.println("Introduce la nota alfabetica:");
	char notaAlfab = (char) System.in.read();
	//Declaramos una nota numerica
	int notaNumerica = 0;
	//variable logica para comprobar si la nota es correcta
	boolean notaCorrecta = true;
	
	//Convertimos la nota alfabetica a numerica
	switch(notaAlfab)
	{
	case  'I' :
		notaNumerica = 4;
		break;
	case  'F' :
		notaNumerica = 5;
		break;
	case  'B' :
		notaNumerica = 6;
		break;
	case  'N' :
		notaNumerica = 7;
		break;
	case  'S' :
		notaNumerica = 9;
		break;
	default:
		System.out.println("La nota introducida no es correcta");
		notaCorrecta = false;
		
		break;
		
		
			
	}
	//comprobamos si la nota es correcta 
	if(notaCorrecta)
	{
	//enviamos a pantalla 
	System.out.println("la nota numerica es: " + notaNumerica);
	}
	
	}
}
