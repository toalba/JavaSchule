
public class Aussendienstler extends Angestellter{
	
	private String Bezirk;

	public Aussendienstler(String name, int alter, String abteilung,String bezirk) {
		super(name, alter, abteilung);
		this.Bezirk=bezirk;
		
	}

	public String getBezirk() {
		return Bezirk;
	}

	public void setBezirk(String bezirk) {
		Bezirk = bezirk;
	}
	public void ausgabe()
	{
		super.ausgabe();
		System.out.printf("Bezirk: %s",Bezirk);
	}
	
	

}
