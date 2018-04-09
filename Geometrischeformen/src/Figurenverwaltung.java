
public class Figurenverwaltung {

	public static void main(String[] args) {
		Kreis[] kreis =new Kreis[5];
		double d = 334.4;
		int num = 1;
		
		for (int i = 0; i < kreis.length; i++) {
			Kreis k = new Kreis(d++);
			kreis[i] = k;
		}
		for (int i = 0; i < kreis.length; i++) {
			System.out.println();
			System.out.print(num);
			System.out.println(".");
			kreis[i].ausgabe();
			num++;
		}

	}

}
