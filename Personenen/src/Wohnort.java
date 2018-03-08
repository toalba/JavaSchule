
public class Wohnort {

	int plz;
	int hausnummer;
	String Strasse;
	String Ort;
     
	public Wohnort(int pz, int haus, String Str, String O)
	{
		plz=pz;
		hausnummer=haus;
		Strasse=Str;
		Ort=O;
	}
	
	public int getPLZ()
	{
		return plz;
	}
	public int getHausnummer()
	{
		return hausnummer;
	}
	public String getOrt()
	{
		return Ort;
	}
	public String getStrasse()
	{
		return Strasse;
	}
}
