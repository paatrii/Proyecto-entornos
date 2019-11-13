package programacionmodular;

import java.util.Scanner;

public class SalarioNeto2 {

	public static void main (String [] args) 
	{
		int empleados = pedirEmpleados();
		double tarifa = pedirTarifa();
	    calcularSalario(empleados, tarifa);
		
	}
	

//////////////////////////////////////////////////////////////////////////////////
	public static int pedirEmpleados() {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Numero de empleados: ");
		return entrada.nextInt();

	}

//////////////////////////////////////////
	public static double pedirTarifa() {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Numero de tarifa: ");
		return entrada.nextInt();

}
/////////////////////////////////////////////////////////
	private static void calcularSalario (int empleados, int tarifa)
	{
		for(int i = 1; i <= empleados; i++)
		{
			System.out.println("Empleados" + i);
			int horasTrabajadas = pedirHorasTrabajadas();
			double salarioBruto = pedirsalarioBruto(horasTrabajadas,tarifa);
			double impuestos = pedirImpuestos(salarioBruto);
			double salarioNeto = pedirSalarioNeto(salarioBruto, impuestos);
			verResultado(salarioBruto, impuestos, salarioNeto) ;
		}
		
	}

//////////////////////////////////////////////////////////////
	public static int pedirHorasTrabajadas() {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Numero de horas trabajadas: ");
		return entrada.nextInt();

}
	
///////////////////////////////////////////////////////////////////
	public static double pedirSalarioBruto() {
		Scanner entrada = new Scanner (System.in);
		System.out.println(" ");
		return entrada.nextInt();

}
	
//////////////////////////////////////////////////////////////////////////
	public static int pedirImpuestos() {
		Scanner entrada = new Scanner (System.in);
		System.out.println(" ");
		return entrada.nextInt();

}
	
//////////////////////////////////////////////////////////////////////
	public static int pedirSalarioNeto() {
		Scanner entrada = new Scanner (System.in);
		System.out.println(" ");
		return entrada.nextInt();

}
///////////////////////////////////////////////////////////////////
	public static void verResultados(double impuestos, double salarioBruto) {
		System.out.println();
	}
	
	
	
	
	
	