package herenciaypolimorfismo;

public class TestVehiculo {

	public static void main(String[] args) {
		
		System.out.println("DATOS DEL VEHÍCULO: ");
		System.out.println("");
		Vehiculo vehiculo = new Vehiculo(4, "Gasolina", "BMW", "Negro", "Serie 1");
		System.out.println(vehiculo.mostrarDatos());
		
		System.out.println("DATOS DEL CAMIÓN: ");
		System.out.println("");
		Camion camion = new Camion(10, "Diesel", "Volvo", "Blanco", "Tdi5000", 10000);
		System.out.println(camion.mostrarDatos());

	}

}
