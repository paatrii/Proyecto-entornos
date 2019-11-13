package poo;

public class TestRacional {

	public static void main (String [] args) {
		Racional r1 = new Racional(2,5);
		Racional r2 = new Racional(2,4);
		Racional r3 = r1.suma(r2);
		r3.visualiza();
		Racional r4= Racional.sumarRacional(r1,r2);
		r4.visualiza();
	}

}
