package interfaces_3a;

public class Kunde extends Person implements FileSerializeable, Comparable<Kunde> {
	private String kNr;
	
	
	
	public Kunde(String name, String kNr) {
		super(name);
		this.kNr = kNr;
	}

	
	
	public String getkNr() {
		return kNr;
	}



	public void setkNr(String kNr) {
		this.kNr = kNr;
	}

	@Override
	public void write(String filePath) {
		// TODO Auto-generated method stub

	}

	@Override
	public void read(String filePath) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compareTo(Kunde o) {
		return this.getkNr().compareTo(o.getkNr());
	}
}
