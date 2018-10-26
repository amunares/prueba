package ejemplo;

public class Triangulo extends Figura {
	private double base;
	private double altura;

	public Triangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	
	public double calcularArea()
	{
		return base*altura;
	}

}
