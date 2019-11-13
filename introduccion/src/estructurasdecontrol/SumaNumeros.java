/*Este programa introduce por teclado dos numeros y visualiza en pantalla su suma*/ 
package estructurasdecontrol;
//Importamos la clase Scanner
import java.util.Scanner;

public class SumaNumeros 
{

   public static void main(String args[])
   {
      //Creamos un objeto de tipo scanner
      Scanner  entrada= new Scanner(System.in);
      //Introducimos por teclado los números
       System.out.println("Introduce numero 1: ");
       int num1= entrada.nextInt();
       System.out.println("Introduce numero 2: ");
       int num2=entrada.nextInt();
      //Calculamos la suma
      int suma= num1 + num2;
     //Enviamos a pantalla el resultado
     System.out.println("La suma es: " + suma); 
     
     
   }
}
