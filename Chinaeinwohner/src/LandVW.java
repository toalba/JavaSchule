
public class LandVW {

	public static void main(String[] args) {
		Land Indien = new Land(1095000000, "Indien",0.0138 );
		
		Land China = new Land(1314000000,"China",0.0059);
	
	int jahr = 2018;
	while(Indien.getEinwohner()  < China.getEinwohner())
	{
		Indien.neuesJahr();
		China.neuesJahr();
		jahr++;
		
		System.out.println("Jahr:"+ jahr);
		Indien.ausgabe();
		China.ausgabe();
	}
	 
	}
}
		
