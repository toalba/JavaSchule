
public class Musikverwaltung {

	int pos;
	CD[] cds;
	
	public Musikverwaltung()
	{
		cds = new CD[1000];
		pos=0;
	}
	public void addCD(CD c)
	{
		cds[pos]=c;
		pos++;
	}
	public void ausgabe()
	{
		System.out.println();
		for (int i = 0; i < pos; i++) {
			CD cd = cds[i];
			cd.ausgabe();
		}
	}
	public void loeschen()
	{
        cds[pos-1] = null;
        if (pos > 0)
            pos--;        
	}
	public void loeschen(int loeschPos)
    {
        cds[loeschPos] = cds[pos-1];
        loeschen();       
    }

}
