
public class Kunden extends personen {
	
	private int kundennummer;
	
	public Kunden(String name,int alter,int k)
	{
		super(name,alter);
		this.kundennummer=k;
	}

	public int getKundennummer() {
		return kundennummer;
	}

	public void setKundennummer(int kundennummer) {
		this.kundennummer = kundennummer;
	}
	
	public void ausgabe()
	{
		super.ausgabe();
		System.out.printf("Kundenummer: %d", kundennummer);
	}

}
