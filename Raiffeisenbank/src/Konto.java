import java.util.Scanner;

public class Konto {
	private String nummer;
	protected double saldo;
	
	public Konto(String nummer, double saldo) {
		super();
		this.nummer = nummer;
		this.saldo = saldo;
	}
	public String getNummer() {
		return nummer;
	}
	public void setNummer(String nummer) {
		this.nummer = nummer;
	}
	Scanner s = new Scanner(System.in);
	public void einzahlen()
	{
		System.out.println("Betrag einzahlen eingeben");
		double betrag= Integer.parseInt(s.nextLine());
		saldo=saldo+betrag;
	}
	public void getsaldo()
	{
		System.out.println(saldo);
	}
	public void auszahlen()
	{
		System.out.println("Betrag zum auszahlen eingeben");
		double betrag= Integer.parseInt(s.nextLine());
		saldo=saldo-betrag;
		
	}
	public boolean equals(Object obj) {
		Konto g = (Konto)obj;
		return g.getNummer().equals(nummer);
	}
	

}
