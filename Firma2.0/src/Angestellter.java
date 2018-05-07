
public class Angestellter extends personen {
	private String Abteilung;

	public Angestellter(String name, int alter, String abteilung) {
		super(name, alter);
		Abteilung = abteilung;
	}

	public String getAbteilung() {
		return Abteilung;
	}

	public void setAbteilung(String abteilung) {
		Abteilung = abteilung;
	}
	
	public void ausgabe()
	{
		super.ausgabe();
		System.out.printf(" Abteilung:%s",Abteilung);
	}

}
