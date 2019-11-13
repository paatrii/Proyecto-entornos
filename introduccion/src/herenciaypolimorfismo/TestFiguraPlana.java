package herenciaypolimorfismo;

public class TestFiguraPlana {

	public static void main(String[] args) {
		
		FiguraPlana figuraPlana = new Rectangulo (4,2);
		System.out.println("Area es igual a: " + figuraPlana.area());
		Rectangulo rectangulo = new Rectangulo (5,6);
		System.out.println(("El area del rectangulo es igual a: " + rectangulo.area()));

	}

}
