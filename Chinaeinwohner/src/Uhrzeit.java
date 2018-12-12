
public class Uhrzeit implements Comparable<Uhrzeit> {

	 private int stunden;
	 private int minuten;
	 private int sekunden;


	public Uhrzeit(int stunden, int minuten, int sekunden) {
		super();
		this.stunden = stunden;
		this.minuten = minuten;
		this.sekunden = sekunden;
	}



	public int getStunden() {
		return stunden;
	}



	public void setStunden(int stunden) {
		this.stunden = stunden;
	}



	public int getMinuten() {
		return minuten;
	}



	public void setMinuten(int minuten) {
		this.minuten = minuten;
	}



	public int getSekunden() {
		return sekunden;
	}



	public void setSekunden(int sekunden) {
		this.sekunden = sekunden;
	}



	@Override
	public int compareTo(Uhrzeit o) {
		return(sekunden+minuten*60+stunden*60*60 - o.getSekunden()+o.getMinuten()*60+o.getStunden()*60*60);
		
	}

	
	
public static void main(String[] args) {
		Uhrzeit u1 = new Uhrzeit(12,30,40);
		Uhrzeit u2 = new Uhrzeit(14,30,40);
		
		int gleich= u1.compareTo(u2);
		System.out.println(gleich);
	}
}
