package alke_wallet;

// Importa Clases Nativas 
import java.util.Scanner;

// Importa Clases
import clases.CuentaBancaria;
import clases.CuentaUSD;
import clases.FormaPago;
//import clases.TarjetaCredito;
// import clases.Efectivo;
// import clases.PayPal;
import clases.Cliente;


public class Main 
	{

	// Instancia Librerías
	static Scanner entrada  = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		
		// Agregar un menú
		
		
		
		// Crear cliente
		
		// Llamo a método para crear al cliente y desde Cliente, crea la cuenta 
		Cliente clienteNuevo = crearCliente();
		clienteNuevo.imprimirDatos();
		
		
		//CuentaUSD ingresoUSD = new CuentaUSD();
		//ingresoUSD.ingresarDinero(10); // 10USD
		
		CuentaUSD ingresoUSD = new CuentaUSD();
		ingresoUSD.ingresarDinero(10); // 10USD
		
		clienteNuevo.imprimirDatos();
		

		// FormaPago pagos;
		
		// pagos = new CuentaUSD();
//		// pagos.procesarPago();


		
		
		// Cierra librerias
		entrada.close();
						
				
		
		
		/*
		// Llamo a método para crear un cliente
		Cliente clienteNuevo = crearCliente();
		// System.out.println("# de Cuenta: " + cuenta.getNumeroCuenta());
		clienteNuevo.imprimirDatos();
		*/

		//		// Llamo a método para crear una cuenta
//		CuentaBancaria cuentaNva = crearCuenta();
//		// System.out.println("# de Cuenta: " + cuenta.getNumeroCuenta());
//		cuentaNva.imprimirDatos();

		
		// Mostrando la forma de pago según selección
//		System.out.println("Practicando el polimorfismo de formas de pago");
//		
//		FormaPago pagos;
//		
//		pagos = new TarjetaCredito();
//		pagos.procesarPago();
//
//		pagos = new PayPal();
//		pagos.procesarPago();
//
//		pagos = new Efectivo();
//		pagos.procesarPago();

		// Cierra librerias
		//entrada.close();
	}
	
	
	/* 
	 * ==========================================================
	 * Métodos propios
	 * ==========================================================
	 */
	
	public static Cliente crearCliente()
	{
		// Instancia la cuenta
		Cliente nuevoCliente = new Cliente();
		 
		// Ingresa de datos
		System.out.println("Ingrese el número de cliente: ");
		nuevoCliente.setId(entrada.nextLong());
		entrada.nextLine();
		
		System.out.println("Ingrese el nombre del titular: ");
		//int varCuentaBancaria = entrada.nextInt();
		nuevoCliente.setNombre(entrada.nextLine());
		//entrada.nextLine();
		
		// Crea la cuenta del cliente
		nuevoCliente.setCuenta(crearCuenta(nuevoCliente.getNombre()));
		
		// Retorna valor
		return nuevoCliente;
	}
	
	public static CuentaBancaria crearCuenta(String nombre)
	{
		
		// Instancia la cuenta
		CuentaBancaria cuenta = new CuentaBancaria();

		System.out.println("Ingrese el # de cuenta bancaria: ");
		//int varCuentaBancaria = entrada.nextInt();
		cuenta.setNumeroCuenta(entrada.nextInt());
		entrada.nextLine();

		System.out.println("Ingrese el saldo inicial: ");
		// double varSaldoInicial = entrada.nextDouble();
		cuenta.setSaldoActual(entrada.nextDouble());

		// Retorna valor
		return cuenta;
	}


	
	/*
	 * ==========================================================
	 * FIN Métodos propios
	 * ==========================================================
	 */	
	
	
	
}
