package clases;

public class Empleado extends Persona 
{
	private String cargo;

	public Empleado() 
	{
	}

	public Empleado(String cargo) 
	{
		this.cargo = cargo;
	}

	// Agrego el método constructor de su padre: Persona
	public Empleado(String nombre, String rut, String cargo) 
	{
		super(nombre, rut);
		this.cargo = cargo;
	}
	// FIN Agrego el método constructor de su padre: Persona

	public String getCargo() 
	{
		return cargo;
	}

	public void setCargo(String cargo) 
	{
		this.cargo = cargo;
	}
	
	
	
		

}
