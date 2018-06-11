
public class Sparkonto extends Konto{
	final double zins= 1.85;

	public Sparkonto(String nummer, double saldo) {
		super(nummer, saldo);
		
	}

	public void abheben()
	{
		System.out.println("Betrag zum abheben eingeben");
		double betrag= Integer.parseInt(s.nextLine());
		saldo=saldo-betrag;
	}
	
	public void zinssatz()
	{
		saldo=saldo*zins;
	}

	
	
}
