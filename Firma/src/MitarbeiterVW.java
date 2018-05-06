import java.util.ArrayList;

public class MitarbeiterVW {
	
	ArrayList <Mitarbeiter> MVW= new ArrayList <>();
	
	public void add(Mitarbeiter m)
	{
		MVW.add(m);
		
	}
	public void löschen(int l)
	{
		MVW.remove(l);
	}
	public void suche(Mitarbeiter s)
	{
		if(MVW.contains(s))
		{
			System.out.printf("Liste der Treffer: %s",s);
		}	
			
	}
	public void ausgabe()
	{
		for (int i = 0; i < MVW.size(); i++) {
			
			Mitarbeiter a= MVW.get(i);
			a.ausgabe();
		}
	}
	public void anzahl()
	{
		int a=MVW.size();
		System.out.println(a);
	}
	public void leiter(Mitarbeiter Leitung)
	{
		if(MVW.contains(Leitung))
			{
			System.out.println(Leitung);
			}
	
	}

}
