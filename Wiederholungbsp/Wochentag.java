import java.util.Scanner;

public class Wochentag {
	
	static void berrechnung(int tag,int monat, int jahr)
	{
		int[] Monat_k= {-1,1,4,4,0,2,5,0,3,6,1,4,6};
		int[] Jahr_k= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,3,6,4};
		String[] Wochentage= {"Sa","So","Mo","Di","Mi","Do","Fr"};
		
		int step;
		//Step 1
		
		step = jahr+jahr%100;
		 int jahrvorne= jahr/100;
		
		//Step 2
		
		step= step + Monat_k[monat];
		
		//Step 3
		
		step=step+tag;
		
		//Step 4
		
		step= step + Jahr_k[jahrvorne];
		
		//Step 5
		
		if(jahr%4==0 && (monat==1|| monat==2))
		{
			step--;
			
		}
		
		//Step 6
		
		int Wochentag = step%7;
		String Wochent= Wochentage[Wochentag];

		System.out.println(Wochent);
		
	}
	
	

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Datum eingeben(dd.mm.jjjj)");
		String Datum = s.next();
		String[] p = Datum.split("\\.");
		int tag=Integer.parseInt(p[0]);
		int monat=Integer.parseInt(p[1]);
		int jahr=Integer.parseInt(p[2]);
		
		berrechnung(tag,monat,jahr);

	s.close();
		
		

	}

}
