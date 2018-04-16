
public class Song {
	
	private double laenge;
	private String titel;
	
	public Song(double l, String t)
	{
		this.laenge= l;
		this.titel = t;
	}
	public void ausgabe()
	{
		System.out.printf("Titel: %s Länge: %f",titel,laenge);
		System.out.println();
	}
	

}
