import java.util.Scanner;

public class test {

	public static void main(String[] args) {
			
		MitarbeiterVW a= new MitarbeiterVW();
		Scanner s= new Scanner(System.in);
		while(!s.nextLine().equals("beenden")) {
	    System.out.println("Geben sie new oder delete oder ausgabe ein");
		if(s.nextLine().equals("new"))
		{
		System.out.println("Vorname:");
		String Vn = s.nextLine();
		System.out.println("Nachname:");
		String Nn = s.nextLine();
		System.out.println("Abteilung:");
		String A = s.nextLine();
		System.out.println("LEITER oder ARBEITER?");
		String S= s.nextLine();
		Mitarbeiter.STELLUNG st= Mitarbeiter.STELLUNG.valueOf(S);
		System.out.println("Monate im Betrieb:");
		int m = Integer.parseInt(s.nextLine());
		Mitarbeiter x=new Mitarbeiter(Vn,Nn,A,st,m);
		a.add(x);
		}
	    if(s.nextLine().equals("delete")) {
			System.out.println("Position des zu Löschenden");
		int l= Integer.parseInt(s.nextLine());
		a.löschen(l);;
     	}
		if(s.nextLine().equals("ausgabe"))
		{
			a.ausgabe();
		}
		}
		s.close();
		
		}
	

}
