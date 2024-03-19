package clases;

public class Cuadrado extends Poligono {
	
	private double lado;

	public Cuadrado() {
	}

	public Cuadrado(double lado) {
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	double calculandoArea() {
		
		return lado * lado;
	}

	@Override
	void imprimirPoligonos() {
		System.out.println("El area del cuadrado es: " + calculandoArea());
		
	}	

}
