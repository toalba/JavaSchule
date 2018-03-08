
public class Personenen {

    String Vorname;
	String Nachname;
	int alter;
	Wohnort wohnort;
	
	public Personenen(int alt,String Vn,String Nn)
	{
		Vorname=Vn;
		Nachname=Nn;
		alter=alt;
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
