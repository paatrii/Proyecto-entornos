package herenciaypolimorfismo;
/**
 * 
 * @author davii

 * 
 *  Una clase abstracta es aquella que por lo menos tiene un elemento abstracto
 *  Un elemento abstracto es una herramienta que tiene java para ejecutar el polimorfismo
 *  No se pueden crear objetos de una clase abstracta
 * 
 */
public abstract class FiguraPlana {

	//atributos
	protected double base;
	protected double altura;
	public FiguraPlana(double base, double altura) {
		
		this.base = base;
		this.altura = altura;
	}
	public double getBase() {
		return base;
	///////////////////////////////////////////////
	}
	public void setBase(double base) {
		this.base = base;
	////////////////////////////////////////////////
	}
	public double getAltura() {
		return altura;
	////////////////////////////////////////////////
	}
	public void setAltura(double altura) {
		this.altura = altura;
	////////////////////////////////////////////////
	}
	public String mostrarDatos(){
		return "\n" + base + "\n" + altura;
	}
	
	//Metodo Abstracto
	public abstract double area();
	
}
