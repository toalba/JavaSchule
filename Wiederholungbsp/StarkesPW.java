public class StarkesPW {

	static boolean hasUpper(String pw)
	{
		for (char c : pw.toCharArray())
		{
			if (Character.isUpperCase(c))
			{
				return true;
			}
		}
		return false;
	}
	
	
	
	static boolean hasLower(String pw)
	{
		for (char c : pw.toCharArray())
		{
			if (Character.isLowerCase(c))
			{
				return true;
			}
		}
		return false;
	}
	
	static boolean hasDigit(String pw)
	{
		for (char c : pw.toCharArray())
		{
			if (Character.isDigit(c))
			{
				return true;
			}
		}
		return false;
	}
	
	static boolean hasSpecialChar(String pw)
	{
		for (char c : pw.toCharArray())
		{
			if (!Character.isLetterOrDigit(c))
			{
				return true;
			}
		}
		return false;
	}
	
	public static boolean isStrong(String pw)
	{
		return pw.length() > 8 && hasLower(pw) && hasUpper(pw) 
				&& hasDigit(pw) && hasSpecialChar(pw);
	}
	
	public static void main(String[] args) {
		String pw = "";
		boolean strong = isStrong(pw);
		System.out.printf("%s", strong);

	}

}
