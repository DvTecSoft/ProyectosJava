package clases;

public class Perro1 extends Animal1
{
	private String raza;

	/**
	 * 
	 */
	public Perro1() 
	{
	}
	
	/**
	 * @param raza
	 */
	public Perro1(String raza) 
	{
		this.raza = raza;
	}
	
	public Perro1(String nombre, double peso, String raza) 
	{
		super();
		this.raza = raza;
	}
	
	public String getRaza() 
	{
		return raza;
	}

	public void setRaza(String raza) 
	{
		this.raza = raza;
	}

	// Métodos propios
	@Override
	public void emitirSonido()
	{
		System.out.println("Guau de Perro");
	}
	// FIN Métodos propios


	
	
	
	
	
	
}
