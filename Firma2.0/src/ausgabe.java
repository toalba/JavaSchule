import java.util.ArrayList;

public class ausgabe {

	public static void main(String[] args) {
		
		personen a1= new personen("Torben",16);
		personen a2= new personen("Christian",16);
		Angestellter b1= new Angestellter("Holzi",16,"Wirtschaft");
		Angestellter b2= new Angestellter("Beni",16,"Betriebsinformatik");
		ArrayList<Firmenkunde> Fkunde= new ArrayList<Firmenkunde>();
		Firmenkunde fk= new Firmenkunde("Holzi Holz",123,88,"Warxproduktion1000");
		Firmenkunde fk1= new Firmenkunde("torben Holz",122,87,"Warxproduktion1000");
		Firmenkunde fk2= new Firmenkunde("chrisi Holz",126,89,"Warxproduktion1000");
		Fkunde.add(fk);
		Fkunde.add(fk1);
		Fkunde.add(fk2);
        
		for (int i = 0; i < Fkunde.size(); i++) {
		 Firmenkunde c1 =Fkunde.get(i);
			c1.ausgabe();
			System.out.println();
		}
		
		
		a1.ausgabe();
		a2.ausgabe();
		b1.ausgabe();
		b2.ausgabe();
	}

}
