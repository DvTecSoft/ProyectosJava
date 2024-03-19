package clases;

public class Animal1 
{

	protected String nombre; 
	protected double peso;
	/**
	 * 
	 */
	public Animal1() {
	}
	/**
	 * @param nombre
	 * @param peso
	 */
	public Animal1(String nombre, double peso) 
	{
		this.nombre = nombre;
		this.peso = peso;
	}
	public String getNombre() 
	{
		return nombre;
	}
	
	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) 
	{
		this.peso = peso;
	}
	
	// Métodos propios
	public void comer()
	{
		System.out.println("Comer Padre");
	}
	
	public void dormir()
	{
		System.out.println("Dormir Padre");
	}
	
	public void emitirSonido()
	{
		System.out.println("Hola desde Animal");
	}
	// FIN Métodos propios
	
	
	
}
