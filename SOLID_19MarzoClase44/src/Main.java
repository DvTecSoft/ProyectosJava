import clases.AccionPicotear;
import clases.AccionVolar;
import clases.Animal;
import clases.Condor;
import clases.Gato;
import clases.Perro;
import clases.Pinguino;

public class Main 
{
	public static void main(String[] args) 
	{
		Animal[] ani 	= new Animal[4];
		ani[0] 			= new Perro();
		ani[1] 			= new Gato();
		ani[2] 			= new Condor();
		ani[3] 			= new Pinguino();

		for (Animal animal : ani) 
		{
			animal.ruido();
			
			if (animal instanceof AccionVolar )
			{
				((AccionVolar) animal).volar();
			}
			
			if (animal instanceof AccionPicotear )
			{
				((AccionPicotear) animal).picotear();
			}
		} 
	}
}
