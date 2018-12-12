
public class Bruch implements Comparable<Bruch> {

	private double zaehler;
	private double nenner;
	
	
	
	public Bruch(double zaehler, double nenner) {
		super();
		this.zaehler = zaehler;
		this.nenner = nenner;
	}



	public double getZaehler() {
		return zaehler;
	}



	public void setZaehler(double zaehler) {
		this.zaehler = zaehler;
	}



	public double getNenner() {
		return nenner;
	}



	public void setNenner(double nenner) {
		this.nenner = nenner;
	}



	@Override
	public int compareTo(Bruch o) {
		
		return(int)((zaehler/nenner - o.getZaehler()/o.getNenner())*1000000);
		
	}
	
	
	public static void main (String[] args) {
		
		Bruch b1 = new Bruch(1,2);
		Bruch b2 = new Bruch(1,4);
		int gleich = b1.compareTo(b2);
		System.out.println(gleich);
	}
}
