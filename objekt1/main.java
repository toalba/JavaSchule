package objekt1;

public class main {
	public static void main(String[] args) {
		shoppingcart sc = new shoppingcart();
		buch b = new buch(1, 32, " ZZZ ", "Z2", 2080);
		sc.add(b);

		CDVD d = new CDVD(2, 14, "bbb", 90, 2080);
		sc.add(d);

		sc.showBill();
	}

}
