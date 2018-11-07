package objekt1;

public class buch extends CArtikel {

	public final double Vat = (float) 0.07;
	private String Autor;
	private String Titel;
	private int Jahr;

	public buch(int Artikelnummer, float Preis, String autor, String titel, int jahr) {
		super(Artikelnummer, Preis);
		Autor = autor;
		Titel = titel;
		Jahr = jahr;
	}

	public String getAutor() {
		return Autor;
	}

	public void setAutor(String autor) {
		Autor = autor;
	}

	public String getTitel() {
		return Titel;
	}

	public void setTitel(String titel) {
		Titel = titel;
	}

	public int getJahr() {
		return Jahr;
	}

	public void setJahr(int jahr) {
		Jahr = jahr;
	}

	public double getVat() {
		return Vat;
	}
	public double getPreis(){
		return super.getPreis()* (1 + Vat);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Buch - %s : %s (%d) : %f", Autor, Titel, Jahr, getPreis());
	}

}
