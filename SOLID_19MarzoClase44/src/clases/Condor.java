package clases;

public class Condor extends Animal implements AccionPicotear, AccionVolar
{

	@Override
	public void ruido() 
	{
		System.out.println("pio");
		
	}

	@Override
	public void volar() 
	{
		System.out.println("yuuum");
		
	}

	@Override
	public void picotear() 
	{
		System.out.println("pic");
		
	}

}
