package clases;

public class Persona 
{
	/**
	 * Declaro atributos
	 */
	private String nombre;
	private String apellido;
	private int edad;
	private int rut;
	private char dv;
	private Perro perro;
	// FIN Declaro atributos
	
	/**
	 * Creo Constructores
	 */
	public Persona() 
	{
	}
	
	public Persona(String nombre, String apellido, int edad, int rut, char dv, Perro perro) 
	{
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.rut = rut;
		this.dv = dv;
		this.perro = perro;
	}
	// FIN Creo Constructores 
	
	/**
	 * Creo get & set
	 * @return
	 */
	public String getNombre() 
	{
		return nombre;
	}
	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}
	public String getApellido() 
	{
		return apellido;
	}
	public void setApellido(String apellido) 
	{
		this.apellido = apellido;
	}
	public int getEdad() 
	{
		return edad;
	}
	public void setEdad(int edad) 
	{
		this.edad = edad;
	}
	public int getRut() 
	{
		return rut;
	}
	public void setRut(int rut) 
	{
		this.rut = rut;
	}
	public char getDv() 
	{
		return dv;
	}
	public void setDv(char dv) 
	{
		this.dv = dv;
	}
	public Perro getPerro() 
	{
		return perro;
	}
	public void setPerro(Perro perro) 
	{
		this.perro = perro;
	}
	// FIN Creo get & set
	
	
	

}
