
public class RechtwinkligesDreieck {
	
	private double breite;
	private double laenge;
	private double hypothenuse;
	
	public RechtwinkligesDreieck(double b,double l, double h)
	{
		this.breite=b;
		this.laenge=l;
		this.hypothenuse=h;
	}
	public double flache()
	{
		return breite*laenge/2;
		
	}
	public double umfang()
	{
		return breite+laenge+hypothenuse;
	}
	public void ausgabe()
	{
		System.out.printf("Fläche %s Umfang %s Breite %f Länge %f Hypothenuse %f",flache(),umfang(),breite,laenge,hypothenuse);
	}
	
	

}
