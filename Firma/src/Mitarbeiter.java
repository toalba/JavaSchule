
public class Mitarbeiter {

	private String Vorname;
	private String Nachname;
	private String Abteilung;
	 enum STELLUNG{LEITER,ARBEITER};
	private double Monate;
	STELLUNG s;
	
	
	public Mitarbeiter(String Vn,String Nn,String A,STELLUNG s,double m)
	{
		this.Vorname=Vn;
		this.Nachname=Nn;
		this.Abteilung=A;
		this.s=s;
		this.Monate=m;		
	}

	public void ausgabe()
	{
		System.out.printf("Vorname: %s, Nachname: %s,Abteilung: %s,Stellung: %s,Zeit:%d ",Vorname, Nachname,Abteilung,s,Monate);
		System.out.println();
	}

}
