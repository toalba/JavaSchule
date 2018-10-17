
public class icecube {

	
	static void Prüfer( String email)
	{
		// prüfe auf @
		
		if(email.contains("@"))
		{
			System.out.println("@ ist da");
		}
		
		// nach punkt zeichen prüfen
		
		if(email.contains("."))
		{
			String[] domaina = email.split("//.");
			String domain = domaina[0];
			if(domain.length() >3)
			{
				System.out.println("Domain stimmt");
			}
			
		}
		else
		{
			System.out.println("Domain fehlt");
		}
		
		
	}

	
	public static void main(String[] args) {
		
		String email = "tb@kleinunfpartner.at";
	    Prüfer(email);
		
		
		
	}

}

