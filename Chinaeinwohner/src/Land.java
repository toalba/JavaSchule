
public class Land {

		private String name;
		private int einwohner;
		private double wachstumsrate;
		
		public Land(int einw, String n, double wtr)
		{
			einwohner = einw;
			wachstumsrate = wtr;
			name = n;
		}
	
	public void ausgabe()
	{
		System.out.printf("%s : %d (%.2f %%)\n", name, einwohner, wachstumsrate);
	}
	public void neuesJahr()
	{
		einwohner += (einwohner *wachstumsrate);
	}


	public int getEinwohner() {
		
		return einwohner;
	}
}


