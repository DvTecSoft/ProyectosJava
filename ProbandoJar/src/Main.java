import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declaramos las variables
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
	}

}
