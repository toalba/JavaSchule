package objekt1;

public class CDVD extends CArtikel{

	public final double Vat = (float) 0.19;
	private String Name;
	private int Dauer;
	private int Laendercode;
	public CDVD(int Artikelnummer, float Preis, String name, int dauer, int laendercode) {
		super(Artikelnummer, Preis);
		Name = name;
		Dauer = dauer;
		Laendercode = laendercode;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getDauer() {
		return Dauer;
	}
	public void setDauer(int dauer) {
		Dauer = dauer;
	}
	public int getLaendercode() {
		return Laendercode;
	}
	public void setLaendercode(int laendercode) {
		Laendercode = laendercode;
	}
	public double getVat() {
		return Vat;
	}
	
	public double getPreis(){
		return super.getPreis()* (1 + Vat);
		
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("DVD - %s  %f", Name, getPreis());
	}


	
}
