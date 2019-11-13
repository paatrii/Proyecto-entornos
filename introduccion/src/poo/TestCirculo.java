package poo;

public class TestCirculo {

	public static void main(String[] args)
	{
		//Construimos o instanciamos un circulo
		Circulo cir1 = new Circulo(4, 2);
		Circulo cir3 = cir1;
		System.out.println("La base de cir3 es " + cir3.getRadio());
		//Modificamos la base del rectángulo
		cir1.setRadio(6);
		//invocamos al constructor copia
		cir3 = new circulo(rec1);
		/*Comprobamos que la modificación se ha hecho*/
		System.out.println("La base del circulo rect3 es " +rec3.getBase());
		//Enviamos a pantalla el área del triángulo
		System.out.println("El área es " + rec1.area());
		//Enviamo a pantalla el périmetro del triangulo
		System.out.println("El périmetro del rectángulo es" +rec1.perimetro());
		
		//Creamos otro rectángulo.
		Rectangulo rec2 = new Rectangulo();
		rec2.setBase(8);
		//Visualizamos el área de este rectángulo.
		System.out.println("El área de este rectángulo es " + rec2.area());
		System.out.println("la altura del rectángulo es " + rec2.getAltura());
	}
	

}