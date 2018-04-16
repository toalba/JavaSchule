
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

	    

	public static void main(String[] args) {
		
		
		CD acdc = new CD("AC|DC");
		CD camora =new CD("RAF Camora");
		Song hwh= new Song(3.28,"High Way to Hell");
		Song pri= new Song(3.23,"Primo");
		Song omt= new Song(3.08,"Ohne mein Team");
		Song gc= new Song(2.27,"Gotham City");
		
		acdc.addsong(hwh);
		camora.addsong(pri);
		camora.addsong(omt);
		camora.addsong(gc);
		
        
		
		
	}
	

}
