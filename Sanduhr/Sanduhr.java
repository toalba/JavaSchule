import java.util.Scanner;

public class Sanduhr {
	
	 static void berrechnung(int width)
	{
			int a=width;
			int x=2;

			
			  
			while(width<=a){

				  int einrücken=(a-width)/2;
				  
				     for (int i=0;einrücken>i;i++) 

				     {
				    	 System.out.print(" ");
						
				     }
		        	for(int i=1;i<=width;i++)
		        	{
		        		System.out.print("#");
		        	}
		        	System.out.println();
		        	width=width-x;
		        	if(width<=3)
		        	{
		        		x=-x;
		        	}
		        }
	}

	public static void main(String[] args) {
		
	Scanner s = new Scanner(System.in);
	System.out.println("width groesser 3 eingeben");
	int width = s.nextInt();
    berrechnung(width);
		
		
		

	}
}

