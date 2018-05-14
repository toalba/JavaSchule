
public class Firmenkunde extends Kunden{
	private String Firmenname;
	
	public Firmenkunde(String name , int alter,int k,String fn)
	{
		super(fn, k, k);
		this.Firmenname=fn;
	}

	public String getFirmenname() {
		return Firmenname;
	}

	public void setFirmenname(String firmenname) {
		Firmenname = firmenname;
	}

	public void ausgabe()
	{
		super.ausgabe();
		System.out.printf("Firmenname: %s",Firmenname);
	}
}
