
public class Geschäftspartner extends personen{
	
	private int jahre;

	public Geschäftspartner(String name, int alter,int jahre) {
		super(name, alter);
		this.jahre=jahre;
	}

	public int getJahre() {
		return jahre;
	}

	public void setJahre(int jahre) {
		this.jahre = jahre;
	}
	public void ausgabe()
	{
		super.ausgabe();
		System.out.printf("Jahre schon dabei: %d",jahre);
	}

	
	
	

}
