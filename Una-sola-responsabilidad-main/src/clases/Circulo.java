package clases;

public class Circulo extends Poligono {
	
	private double radio;

	public Circulo() {
	}

	public Circulo(double radio) {
		this.radio = radio;
	}

	public double getLado() {
		return radio;
	}

	public void setLado(double radio) {
		this.radio = radio;
	}

	@Override
	double calculandoArea() {
		
		return Math.PI * radio * radio;
	}

	@Override
	void imprimirPoligonos() {
		System.out.println("El area del circulo es: " + calculandoArea());
		
	}	

}
