
public class EmailCheck {
	

	static boolean Prüfer (String email)
	{
		
		String person = "";
		String host = "";
		String domain ="";
		if(email.contains("\\@") && email.contains("\\."))
		{
		
		String f="";

		String[] e = email.split("@");	
			 f = e[1];
			String[] b = f.split("\\."); 
			
	    person = e[0];
		host = b[0];
	    domain = b[1];
		
		System.out.println(person);
		System.out.println(host);
		System.out.println(domain);
		
		}
		else 
		{
			return false;
		}
		return(person.length()>1 && domain.length()>1 && host.length()<3 && host.length()>1);  
		

		
	}
	
	public static void main(String[] args) {
		
		String email = "tb@kleinundpartner.at";
	    boolean ok = Prüfer(email);
	    System.out.println(ok);
		
		
		
	}

}
