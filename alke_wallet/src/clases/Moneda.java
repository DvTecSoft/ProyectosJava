package clases;

public class Moneda implements FormaPago 
{
	/** 
	 * Método procesar pago desde Tarjeta de crédito
	 */
	@Override
	public void realizarPago() 
	{
		System.out.println("Procesando pago con MasterPlop");
	}
	
//	/**
//	 * Interfaz que devuelte el simbolo de la conversion
//	 * @return el simbolo
//	 */
//	public String getSimbolo();
//	
//	/**
//	 * Interfaz que devuelve el factor de conversión 
//	 * @return el factor en float
//	 */
//	public float getFactorConversion();
//
//	/**
//	 * Método para convertir
//	 */
//	public void convertir();

}

