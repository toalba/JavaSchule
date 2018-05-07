package vererbung;

public class Gebrauchtauto extends auto{
	private int baujahr;
	
	public Gebrauchtauto(String farbe,int leistung,int baujahr)
	{
		super(leistung,farbe);
		this.baujahr=baujahr;
	}
	
	public int getBaujahr() {
		return baujahr;
	}

	public void setBaujahr(int baujahr) {
		this.baujahr = baujahr;
	}
	
	public void ausgabe()
	{
		super.ausgabe();
		System.out.printf(" Baujahr:%d",baujahr);
	}

	public static void main(String[]args)
	{
		auto a1 = new auto(90,"rot");
		a1.ausgabe();
		System.out.println();
		Gebrauchtauto a2= new Gebrauchtauto("lila",90,2002);
		a2.ausgabe();
	}
}
