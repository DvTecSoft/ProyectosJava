package clases;

public class Circulo extends Poligono 
{
	private int radio;
	
	/**
	 * Constructor vacío
	 */
	public Circulo() 
	{
	}

	/**
	 * @param radio
	 */
	public Circulo(int radio) 
	{
		this.radio = radio;
	}

	public int getRadio() 
	{
		return radio;
	}

	public void setRadio(int radio) 
	{
		this.radio = radio;
	}

	public int multiplicarArea(int radio)
	{
		int area;
		area = radio * (int) (Math.PI);
		return area;
	}
	
	
	

}
