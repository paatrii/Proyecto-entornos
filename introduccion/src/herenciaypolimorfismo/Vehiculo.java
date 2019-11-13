package herenciaypolimorfismo;

public class Vehiculo {

	private int numRuedas;
	private String combustible;
	private String marca;
	private String color;
	private String motor;
	public Vehiculo(int numRuedas, String combustible, String marca, String color, String motor) {
		super();
		this.numRuedas = numRuedas;
		this.combustible = combustible;
		this.marca = marca;
		this.color = color;
		this.motor = motor;
	}
	public int getNumRuedas() {
		return numRuedas;
	//////////////////////////////////////////////
	}
	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	//////////////////////////////////////////////
	}
	public String getCombustible() {
		return combustible;
	//////////////////////////////////////////////
	}
	public void setCombustible(String combustible) {
		this.combustible = combustible;
	/////////////////////////////////////////////
	}
	public String getMarca() {
		return marca;
	//////////////////////////////////////////////
	}
	public void setMarca(String marca) {
		this.marca = marca;
	//////////////////////////////////////////////
	}
	public String getColor() {
		return color;
	//////////////////////////////////////////////
	}
	public void setColor(String color) {
		this.color = color;
	//////////////////////////////////////////////
	}
	public String getMotor() {
		return motor;
	//////////////////////////////////////////////
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}
	public String mostrarDatos() {
		return numRuedas + "\n" + combustible + "\n" + marca + "\n" + color + "\n" + motor + "\n";
	}
	
}
