package programacionmodular;

import java.util.Scanner;

public class SalarioNeto {

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

///////////////////////////////////////////////////////////////////////////////////
	public static double pedirTarifa () {
		
		Scanner entrada = new Scanner (System.in);
		do {
			tarifa = entrada.nextInt();

		if (tarifa <= 0)
			System.out.println("Introducimos la tarifa: ");
		}while tarifa <= o;
		
		return tarifa;
		
	}

/////////////////////////////////////////////////////////////////////////
	private static void calcularSalario (int empleados, int tarifa)
	{
		for(int i = 1; i <= empleados; i++)
		{
			System.out.println("Empleados" + i);
			int horasTrabajadas = pedirHorasTrabajadas();
			double salarioBruto = pedirsalarioBruto(horasTrabajadas,tarifa);
			double impuestos = pedirImpuestos(salarioBruto);
			double salarioNeto = salarioBruto - impuestos;
			verResultado(salarioBruto, impuestos, salarioNeto) ;
		}
		
	}

///////////////////////////////////////////////////////////////////
	
	public static double calcularBruto(int tarifa, int horas) {
		System.out.println();
	}
/////////////////////////////////////////////////////////////////
	public static void verResultado(int impuestos, int salarioBruto) {
		System.out.println();
	}
	
	
	
	
	
}
