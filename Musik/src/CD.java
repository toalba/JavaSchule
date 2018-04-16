
public class CD {
	private String info;
	int pos;
	Song[] songs;
	
	public CD(String i)
	{
		songs = new Song[30];
		this.info=i;
		pos=0;
	}
	
	public void addsong(Song s)
	{
		songs[pos]=s;
		pos++;
		
	}
	public void ausgabe()
	{
		System.out.println(info);
		
		for (int i = 0; i < pos; i++) {
			Song song = songs[i];
			song.ausgabe();
		}
	}
	public void loeschen()
	{
        songs[pos-1] = null;
        if (pos > 0)
            pos--;        
	}
	public void loeschen(int loeschPos)
    {
        songs[loeschPos] = songs[pos-1];
        loeschen();       
    }
	  public void loeschen2(int loeschPos)
	    {
	        for (int i = loeschPos; i < pos; i++)
	        {
	            songs[i] = songs[i+1];
	           
	        }
	        loeschen();
	    }



}
