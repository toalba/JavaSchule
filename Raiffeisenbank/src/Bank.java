import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bank {



	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<Girokonto> Gkonto= new ArrayList<Girokonto>();
		Girokonto a1 = new Girokonto("AT437574800007262",8000);
		Girokonto a2 = new Girokonto("AT447574500006734",13560);
		
		Gkonto.add(a1);
		Gkonto.add(a2);
		
		
		System.out.println("Eigene Kontonummer!");
		String ek = s.nextLine();
		Girokonto k1 = null;
		for(Girokonto x : Gkonto)
		{
			if (x.getNummer().equals(ek))
			{
				k1 = x;
			}
		}
		//
		System.out.println("Andere Kontonummer!");
		String ak = s.nextLine();
		Girokonto k2 = null;
		for(Girokonto x : Gkonto)
		{
			if (x.getNummer().equals(ak))
			{
				k2 = x;
			}
		}
		System.out.println("Betrag!");
		double i= Integer.parseInt(s.nextLine());
		k1.ueberweisung(i,k2);

	}

}
