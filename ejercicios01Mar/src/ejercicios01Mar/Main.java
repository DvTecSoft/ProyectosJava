package ejercicios01Mar;
// import java.util.*; // importa todas las librerías básicas
import java.util.Scanner;


public class Main {

	public static void main(String[] args) 
	{
		/*
		// instanciar scanner
		Scanner  entrada  = new Scanner(System.in);
		
		System.out.println("Ingrese su nombre");
		String nombre = entrada.nextLine();
		
		System.out.println("Ingrese su Apellido");
		String apellido = entrada.nextLine();
		
		System.out.println("Ingrese su Edad");
		int edad = entrada.nextInt();
		// entrada.nextLine();
		
		String casado;
		int salir = 0;
		boolean casadobool;
		
		while (salir == 0);  
		{
			System.out.println("aqui");
			//System.out.println("Está casado? (true / false)");
			//casado = entrada.nextBoolean();
			
			System.out.println("Está casado? (true / false)");
			casado = entrada.nextLine();
			
			if (casado == "true" || casado == "false")
			{
				if (casado == "true")
				{
					casadobool = true;
				}
				else
				{
					casadobool = false;
				}
				salir = 1;	
			}
			else
			{
				System.out.println("Ingrese True o False. Valide y reintente.");
				casado = "";
				salir = 0;
				System.out.println(salir);
			}
		}

		System.out.println("Su nombre es: " + nombre);
		System.out.println("Su apellido es: " + apellido);
		System.out.println("Su edad es: " + edad);
		System.out.println("Casado?: " + casado);
		 */
		
		// ---- 04/03/2024 ---- // 
		/*
		// Switch
		String diaSemana = "Lunes";
		
		switch(diaSemana)
		{
			case "Lunes":
				System.out.println("Lunes");
				break;
			case "Martes":
				System.out.println("Martes");
				break;
			default:
				System.out.println("Miércoles");
		}
		*/
	
		/*
		//  While
		// Instanciar scanner
		Scanner  entrada  = new Scanner(System.in);

		int num = 1;
		
		while (num != 0)
		{
			System.out.println("Ingrese un número. (0 para salir)");
			num = entrada.nextInt();		
		}
		
		System.out.println("Gracias por su tiempo...");

		// Cierre entrada
		entrada.close();
		*/
		
		/*
		// Do...While
		// Instanciar scanner
		Scanner  entrada  = new Scanner(System.in);

		int num = 1;
		
		do
		{
			System.out.println("Ingrese un número. (0 para salir)");
			num = entrada.nextInt();		
		}
		while (num != 0);
			
		System.out.println("Gracias por su tiempo...");

		// Cierre entrada
		entrada.close();
		*/

		/*
		// ===============================================================
		// FOR
		int i, suma;
		suma = 0;
		
		System.out.println("La suma con ciclo FOR by DVidal");
		
		for (i = 1; i <= 10; i++ )
		{
			suma = suma + i;
			System.out.println("La vuelta " + i + " da " + suma );
		}
		System.out.println("La suma total es: " + suma );
		
		System.out.println("Saludos...DvTec!");
		// FIN FOR
		// ===============================================================
		 */
		
		/*
		// ===============================================================
		// Array
		// Declarar y recorrer un arreglo que almacene el nombre de 
		// 5 países ingresados por el usuario. Mostrar el contenido 
		// del arreglo por pantalla.
		
		Scanner  entrada  = new Scanner(System.in);
		String[] paises = new String[5];
		int i;
		String vPais;
		
		for (i = 0; i <= 4; i++)
		{
			System.out.println("Ingrese un país (posición " + i + ")");
			vPais = entrada.next();		
			
			paises[i] = vPais;
		}
		
		System.out.println("Los países ingresados son: ");
		System.out.println("");
		
		i = 0;
		for (String pais : paises)
		{
			System.out.println("El país ingresado en la posición: " + i + " es " + pais);
			i++;
		}

		// Cierre entrada
		entrada.close();
		
		System.out.println("");
		System.out.println("Adios...DvTec!");	
		// FIN Array
		// ===============================================================
		 */

		
		// ---- 05/03/2024 ---- //
		/*
	  	
	  	// ===============================================================
		// String
		String inputUsuario = "";
		Scanner lector = new Scanner(System.in);
		System.out.println("Hola! Ingresa un texto de longitud 8: ");
		inputUsuario = lector.nextLine();
		
		if ( inputUsuario.length() == 8 )
		{
			System.out.println("CORRECTO!".concat(" Frase mayúscula: ").concat(inputUsuario.toUpperCase()) );
		}
		else
		{
			System.out.println("INCORRECTO!".concat(" Frase minúscula: ").concat(inputUsuario.toLowerCase() ) );
		}
		// FIN String
		// ===============================================================
		*/
		
		/*
		// Ejercicio 1
		Scanner lector = new Scanner(System.in);
		String inputUsuario = ""; // HOLASOYYO
		String caracteres = "";
		
		System.out.println("4ta y 5ta letra");
		System.out.println("");
		System.out.println("Hola! Ingresa un texto: ");
		inputUsuario = lector.nextLine();
		caracteres = inputUsuario.substring(3, 5);
		System.out.println("Los 4to y 5to caracter, son: " + caracteres);
		
		
		// Ejercicio 2
		System.out.println("");
		System.out.println("Cantidad de vocales");
		System.out.println("");
		
		inputUsuario = "";
		char caracter;
		int cantvocales = 0;
		int largotexto;
		int i;

		System.out.println("Hola! Ingresa un texto: ");
		inputUsuario = lector.nextLine();
		
		largotexto = (inputUsuario.length()) - 1;
							
		for (i = 0; i <= largotexto; i++) 
		{
			caracter = inputUsuario.charAt(i);
		
			if ( caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u' || 
				 caracter == 'á' || caracter == 'é' || caracter == 'í' || caracter == 'ó' || caracter == 'ú' || 
				 caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U' || 
				 caracter == 'Á' || caracter == 'É' || caracter == 'Í' || caracter == 'Ó' || caracter == 'Ú'   )
			{
				cantvocales = cantvocales + 1;
			}
		}
		
		System.out.println("La cantidad de vocales es: " + cantvocales);
		*/
		
		/*
		// Math
		Scanner lector 		= new Scanner(System.in);
		int inputUsuario 	= 0;
		int doble 			= 0;
		int triple 			= 0;
		double raiz 		= 0.0;
		double potencia 	= 0.0;
		int pot = 0;
		
		System.out.println("Math algo...");
		System.out.println("");
		System.out.println("Ingrese un número entero: ");
		inputUsuario = lector.nextInt();

		doble 		= inputUsuario * 2;
		triple 		= inputUsuario * 3;
		raiz 		= Math.sqrt(inputUsuario);
		potencia 	= Math.pow(inputUsuario, 7);
		
		pot = (int) potencia; 
		
		System.out.println("El doble es: " + doble );
		System.out.println("El triple es: " + triple );
		System.out.println("La raíz cuadrada es: " + raiz );
		System.out.println("La potencia a 7 es: " + potencia );
		System.out.println("La potencia a 7 es: " + pot );
		*/
		
		
		
		// ===================================================================================
		// ---- 05/03/2024 ---- //
		
		// Mejore prácticas
		/* La clase debe llamarse “ejemplo buenas prácticas”.
		 * las variables a utilizar son “nombre usuario” y “edad usuario”.
		 * importar scanner.
		 * mostrar por consola los datos ingresados.
		*/
		/*
		//Declaramos las variables
		String nombreUsuario = "";
		int edadUsuario = 0;
		//Declaramos el Scanner para leer la info del usuario
		Scanner capturador = new Scanner(System.in);
		//Leer la informacion del usuario
		System.out.print("Ingrese el nombre: ");
		nombreUsuario = capturador.nextLine();
		System.out.println(" ----- ");
		System.out.print("Ingrese tu edad: ");
		edadUsuario = capturador.nextInt();
		System.out.println(" -- Adios -- ");
		*/
		// ---- 05/03/2024 ---- //		
		// ===================================================================================

		
		// ---- FIN 05/03/2024 ---- // 
		// ===================================================================================
		
		// ===================================================================================
		// 08/03/2024
		// Funciones y procedimientos
		/*
		// función en Java
		public static int sumar(int num1, int num2) // Se pone int si la funcion retornará datos. Puede ser string u otro
		{
			int resultado = num1 + num2;	
			return resultado;
		}
		
		// No retorna nada el procedimiento
		public static void metodojava() // Se pone int si la funcion retornará datos. Puede ser string u otro
		{
			System.out.println("hola");	
		}
		*/
		// FIN 08/03/2024
		// ===================================================================================


				
		
		
		
		
		
		
	}
}
