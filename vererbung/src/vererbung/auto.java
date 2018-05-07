package vererbung;

public class auto {
	private String farbe;
	private int leistung;
	
	public auto(int leistung, String farbe)
	{
		this.farbe=farbe;
		this.leistung=leistung;
	}
	
	public String getFarbe() {
		return farbe;
	}
	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}
	public int getLeistung() {
		return leistung;
	}
	public void setLeistung(int leistung) {
		this.leistung = leistung;
	}
	public void ausgabe()
	{
		System.out.printf("farbe:%s, leistung:%d",farbe,leistung);
	}

}
