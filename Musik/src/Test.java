
public class Test {

	public static void main(String[] args) {
		
		Musikverwaltung a =new Musikverwaltung();
		CD acdc = new CD("AC|DC");
		CD camora =new CD("RAF Camora");
		Song hwh= new Song(3.28,"High Way to Hell");
		Song pri= new Song(3.23,"Primo");
		Song omt= new Song(3.08,"Ohne mein Team");
		Song gc= new Song(2.27,"Gotham City");
		
		a.addCD(camora);
		a.addCD(acdc);
		
		acdc.addsong(hwh);
		camora.addsong(pri);
		camora.addsong(omt);
		camora.addsong(gc);
		a.ausgabe();


	}

}
