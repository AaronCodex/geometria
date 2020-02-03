/**
 * 
 * @author Aar�n Moreno Lozano
 * @version 1.2
 */
public class Rectangulo_AML extends FiguraGeometrica_AML {
	private double l1;
	private double l2;
	
	/**
	 * Es un constructor de la clase rectangulo
	 * @param tipoFigura le pasas el tipo de figura
	 * @param lG es un lado del rect�ngulo
	 * @param lP el otro lado del rect�ngulo
	 */
	public Rectangulo_AML(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}
	
	/**
	 * Devuelve el �rea
	 */
	@Override
	public double area() {
		return l1 * l2;
	}
	
	/**
	 * Devuelve el per�metro
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
