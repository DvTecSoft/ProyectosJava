package clases;

public class Persona 
{

	protected String nombre;
	protected String rut;
	
	public Persona() 
	{
	}
	
	public Persona(String nombre, String rut) 
	{
		this.nombre = nombre;
		this.rut = rut;
	}
	
	public String getNombre() 
	{
		return nombre;
	}
	
	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}
	
	public String getRut() 
	{
		return rut;
	}
	
	public void setRut(String rut) 
	{
		this.rut = rut;
	}
	
	
	
	
	
	
}
