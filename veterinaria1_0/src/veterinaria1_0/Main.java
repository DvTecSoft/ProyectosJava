package veterinaria1_0;

import clases.Animal;
import clases.Ave;
import clases.Perro;
import clases.Pez;
import clases.Gato;
import clases.Vaca;

public class Main 
{

	public static void main(String[] args) 
	{
		/*
		Perro p = new Perro();
		
		p.setNombre("Jack");
		p.setPeso(1.5);
		p.setRaza("Quiltro");
		
		System.out.println(p.getNombre());
		System.out.println(p.getPeso());
		System.out.println(p.getRaza());
		
		p.comer();
		p.dormir();
		p.emitirSonido();
		
		Gato g = new Gato();
		
		g.comer();
		g.dormir();
		g.emitirSonido();
		*/
		
		// 
		// comer();
		// dormir();
		
		/*
		// Ejercicio veterinaria 3.0
		Animal1 a = new Animal1();
		Animal1 b = new Perro1();
		Animal1 c = new Gato1();
		Animal1[] arregloAnimales = {a,b,c}; 
		
		// Con For
		for (int i = 0; i <= arregloAnimales.length-1; i++)
		{
			//arreglo bidimensional? o como identificar de quien es el sonido
			System.out.println("El animal dice: ");
			arregloAnimales[i].emitirSonido();
		}
		
		// Con ForEach
		//	for (Animal animal : arregloAnimales) 
		// 	{
		//		System.out.println("");
		//		animal.emitirSonido();
		//	}
		
		// FIN Ejercicio veterinaria 3.0
		 * 
		 */
		
		
		/**
		 * Ejercicio con interfaz
		 */
		/*
		Perro p = new Perro();
		Gato g = new Gato();
		Vaca v = new Vaca();
		
		System.out.println(p.emitirSonido());
		System.out.println(g.emitirSonido());
		System.out.println(v.emitirSonido());
		*/

		/**
		 * Ejercicio con interfaz polimorfismo con arreglo
		 */
		/*
		Perro p = new Perro();
		Gato g 	= new Gato();
		Pez pe 	= new Pez();
		Ave a	= new Ave();
		
		Animal[] arregloAnimales = {p,g,pe,a}; 
		
		// Con ForEach
		for (Animal animal : arregloAnimales) 
	 	{
			System.out.println(animal.emitirSonido());
		}
		*/
		
		Animal[] arr = new Animal[4];
		arr[0] = new Perro();
		arr[1] = new Gato();
		arr[2] = new Pez();
		arr[3] = new Ave();

		// Con ForEach
		for (Animal animal : arr) 
	 	{
			System.out.println(animal.emitirSonido());
		}		
		

	}
	
//	public static void comer()
//	{
//		Perro1 p = new Perro1();
//		p.comer();
//	}
//
//	public static void dormir()
//	{
//		Perro1 p = new Perro1();
//		p.dormir();
//	}

}
