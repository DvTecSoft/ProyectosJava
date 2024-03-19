package clases;

public class Rectangulo extends Figura 
{
	
	protected float base; 
	protected float altura;
	
	/**
	 * 
	 */
	public Rectangulo() 
	{
	} 

	public Rectangulo(int base, int altura) 
	{
		this.base = base;
		this.altura = altura;
	}

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	@Override
	public float area() 
	{
		return base * altura;
	}




	

	
}
