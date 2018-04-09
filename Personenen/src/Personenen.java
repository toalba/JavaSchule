
public class Personenen {

    String Vorname;
	String Nachname;
	int alter;
	Wohnort wohnort;
	
	public Personenen(int alt,String Vn,String Nn, Wohnort Wohn)
	{
		Vorname=Vn;
		Nachname=Nn;
		alter=alt;
		wohnort=Wohn;
	}
	public Wohnort getWohnort()
	{
		return wohnort;
	}
	public void setWohnort(Wohnort wohnort )
	{
		this.wohnort= wohnort;
	}
	
	
}
