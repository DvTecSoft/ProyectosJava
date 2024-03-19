package clases;

public class Cliente extends Persona 
{
	private String tipo;

	/**
	 * Constructor vacío
	 */
	public Cliente() 
	{
	}

	/**
	 * Constructor con parámetros
	 * @param tipo
	 */
	public Cliente(String tipo) 
	{
		this.tipo = tipo;
	}
	
	/**
	 * Constructor heredado padre-hijo
	 * @param nombre
	 * @param rut
	 * @param tipo
	 */
	// Agrego el método constructor de su padre: Persona
	public Cliente(String nombre, String rut, String tipo) 
	{
		super(nombre, rut);
		this.tipo = tipo;
	}
	// FIN Agrego el método constructor de su padre: Persona

	public String getTipo() 
	{
		return tipo;
	}

	public void setTipo(String tipo) 
	{
		this.tipo = tipo;
	}
	
	
	

}
