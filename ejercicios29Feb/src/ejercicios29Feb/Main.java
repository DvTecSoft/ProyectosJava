package ejercicios29Feb;

public class Main 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		
		// String varBool;		
		
//		char identificador = '7';
//		System.out.println("Mi dígito verificador es: " + identificador);
//		
//		
//		boolean estudiante = true;
//		System.out.println("Soy estudiante? " + estudiante);
		
		/*
		if (estudiante == true) 
		{
			varBool = "Verdadero";
		}
		else
		{
			varBool = "Falso";
		}
		System.out.println("Soy estudiante? " + varBool);
		*/
	
//		String apellido = "Vidal";
//		System.out.println("Mi nombre es: Daniel " + apellido);
		

		// Otro
		/*
		int num1 = 6;
		int num2 = 4;
		int resultadoSuma = num1 + num2;
		int resultadoResta = num1 - num2;
		int resultadoMult = num1 * num2;
		double resultadoDivision = (double) num1 / (double) num2;
		int resultadoMod = num1 % num2;
		System.out.println("Suma es : " + resultadoSuma);
		System.out.println("Resta es : " + resultadoResta);
		System.out.println("Multiplicacion es : " + resultadoMult);
		System.out.println("Division es : " + resultadoDivision);
		System.out.println("Mod es : " + resultadoMod);

		resultadoSuma++;
		System.out.println("Suma mas 1 : " + resultadoSuma);
		resultadoSuma--;
		System.out.println("Suma menos 1 : " + resultadoSuma);
		*/
		
		
		// Otro
		int numero1 = 10;
		int numero2 = 15;
		int resultado;
		resultado = numero1 + numero2; 
		System.out.println("La suma1 es : " + (numero1 + numero2) );
		System.out.println("La suma2 es : " + resultado );

		int numero3 = 5;
		double cuadrado = Math.pow(numero3, 2);
		System.out.println("El elevado a 2 es: " + cuadrado );
		
		String palabra1 = "Hola";
		String palabra2 = "Mundo";
		System.out.println("La frase es: " + palabra1 + " " + palabra2);
		
		int numero4 = 3;
		int numero5 = 3;
		String res; 
		
		if (numero4 == numero5 )
		{
			res = "Verdadero";
		}
		else
		{
			res = "Falso";
		}
		
		System.out.println("Son Iguales1?: " + (numero4 == numero5) );
		System.out.println("Son Iguales2?: " + res );
		
		
	}
}

