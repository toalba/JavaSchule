package objekt1;

import java.util.ArrayList;

public class shoppingcart {
	ArrayList<CArtikel> artikel = new ArrayList<CArtikel>();

	public void add(CArtikel a) {
		artikel.add(a);
	}

	public void showBill() {
		double overallPrice = 0;
		for (CArtikel a : artikel) {
			overallPrice += a.getPreis();
			System.out.println(a);
		}
		System.out.printf("Gesamtpreis : %f\n", overallPrice);
	}
}
