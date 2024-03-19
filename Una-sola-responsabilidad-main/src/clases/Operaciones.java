package clases;

public class Operaciones {
	
	static double sumandoArea (Poligono poligono1, Poligono poligono2) {
		return poligono1.calculandoArea() + poligono2.calculandoArea();
	}
	
	static double multiplicandoArea (Poligono poligono1, Poligono poligono2) {
		return poligono1.calculandoArea() * poligono2.calculandoArea();
	}

}
