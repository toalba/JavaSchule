public class Girokonto extends Konto{
	final double ueberziehungsrahmen= 2000;

	public Girokonto(String nummer, double saldo) {
		super(nummer, saldo);
	}
	
	public void ueberweisung(double betrag,Konto K)
	{
		K.saldo= K.saldo+betrag;
		saldo=saldo-betrag;
		
	}
	

}
