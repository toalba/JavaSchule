
public class ausgabe {

	public static void main(String[] args) {
		
		personen a1= new personen("Torben",16);
		personen a2= new personen("Christian",16);
		Angestellter b1= new Angestellter("Holzi",16,"Wirtschaft");
		Angestellter b2= new Angestellter("Beni",16,"Betriebsinformatik");

		a1.ausgabe();
		a2.ausgabe();
		b1.ausgabe();
		b2.ausgabe();
	}

}
