package clases;

public class Perro implements Animal 
{
	/**
	 * 
	 */
	@Override
	public String emitirSonido() 
	{
		
		// TODO Auto-generated method stub
		return "Guau";
	}
	
	@Override
	public String comer() {
		// TODO Auto-generated method stub
		return "Perro come";
	}

	@Override
	public String moverse() {
		// TODO Auto-generated method stub
		return "Perro mueve";
	}
}
