package clases;

public class Pinguino extends Animal implements AccionPicotear
{

	@Override
	public void ruido() 
	{
		System.out.println("pin");
	}

	@Override
	public void picotear() 
	{
		System.out.println("pic");
	}

}
