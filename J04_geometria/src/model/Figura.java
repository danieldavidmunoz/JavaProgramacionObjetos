package model;

public class Figura {

	public double x;
	public double y;
	
	public Figura() {
		super();
	}
	
	public Figura(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public double distanciaCentro() {
		return Math.sqrt(x * x + y * y);
	}
	
	public double area() {
		return 0;
	}

	public double perimetro() {
		return 0;
	}
	@Override // mirar este metodo para poder comparar 
	public boolean equals(Object o){
	//	return this == o;
		if(o == null)
			return false;
		if (this == o)
			return true;
		if (this.getClass() != o.getClass())
			return false;
		Figura otra = (Figura)o;
		return this.x==otra.x && this.y == otra.y;
	}
}
