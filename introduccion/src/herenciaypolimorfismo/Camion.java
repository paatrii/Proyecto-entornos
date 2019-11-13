package herenciaypolimorfismo;

public class Camion extends Vehiculo{
	// atributos
	
	private int LimiteCarga;
	/////////////////////////////////////////////////////////////////
	public Camion(int numRuedas, String combustible, String marca, String color, String motor, int limiteCarga) {
		super(numRuedas, combustible, marca, color, motor);
		LimiteCarga = limiteCarga;
	}
	/////////////////////////////////////////////////////////////////
	public int getLimiteCarga() {
		return LimiteCarga;
	}
/////////////////////////////////////////////////////////////////////
	public void setLimiteCarga(int limiteCarga) {
		LimiteCarga = limiteCarga;
	}
	
	public String mostrarDatos() {
		return super.mostrarDatos() + LimiteCarga + "\n";
	}
	
	
}
