package poo;

import java.util.Scanner;

public class Circulo {

	//Atributos o miembros dato
		private double radio;
		private double pi;
		
		//Constructor
		/*Un constructor es un método especial cuyo objetivo.
		 Es inicializar los atributos de un objeto.
		Un constructor se llama siempre igual que la clase.*/
		public Circulo(double radio, double pi)
		 {
			 this.radio = radio;
			 this.pi = pi;
		 }
	
////////////////////////////////////////////////////////////////
		public Circulo()
		{
			Scanner entrada =new Scanner (System.in);
			System.out.println("Introduzca radio:");
			radio = entrada.nextDouble();
			System.out.println("Introduzca pi:");
			pi = entrada.nextDouble();
		}
		
//////////////////////////////////////////////
		 //Constructor copia.
		 public Circulo(Circulo copia)
		 {
			 
			 radio = copia.radio;
			 pi = copia.pi;
		 }
		//Miembros método u operaciones que puedo hacer con el objeto
			public double getRadio()
			{
				return radio;
			}
			////////////////////////////////////////////
			public void setRadio(double radio) 
			{
				this.radio= radio;
			}
			///////////////////////////////////////
			public double getPi()
			{
			return pi;
			}
			////////////////////////////////////////
			public void setPi(double pi) 
			{
			this.pi = pi;
			}
			///////////////////////////////////////////
			public double area()
			{
				return pi*(radio*2);
			}
			/////////////////////////////////////////
			public double perimetro()
			{
				return 2*pi*radio;
			}
			
	}



