
public class Kreis {
	
	private double radius;
	
	
	public Kreis(double r)
	{
		this.radius=r;
	}
	
	public double flache()
	{
		return Math.PI*radius*radius;
		
	}
	public double umfang()
	{
		return 2*Math.PI*radius;
	}
	public void ausgabe()
	{
		System.out.printf("Fläche:  %s  Umfang:  %s  Radius:  %f ",flache(),umfang(),radius);
	}
}
