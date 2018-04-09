
public class Rechteck {
	
	private double breite;
	private double laenge;
	
	public Rechteck(double b,double a)
	{
		this.breite=b;
		this.laenge=a;
	}
	
	public double flache()
	{
		return breite*laenge;
		
	}
	public double umfang()
	{
		return 2*(breite+laenge);
	}
	public void ausgabe()
	{
		System.out.printf("Fläche %s Umfang %s Breite %f Länge %f",flache(),umfang(),breite,laenge);
	}
	

}
