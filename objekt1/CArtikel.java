package objekt1;

public class CArtikel {

	private int Artikelnummer;
	private double Preis;
	
	public CArtikel(int Artikelnummer, double Preis){
		this.Artikelnummer = Artikelnummer;
		this.Preis = Preis;
	}

	public int getArtikelnummer() {
		return Artikelnummer;
	}

	public void setArtikelnummer(int artikelnummer) {
		Artikelnummer = artikelnummer;
	}

	public double getPreis() {
		return Preis;
	}

	public void setPreis(float preis) {
		Preis = preis;
	}

}
