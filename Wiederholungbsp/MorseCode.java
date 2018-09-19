public class MorseCode {

	  static String[] morsecode = {
			    ".-",     // A
			    "-...",   // B
			    "-.-.",   // C
			    "-..",    // D
			    ".",      // E
			    "..-.",   // F
			    "--.",    // G
			    "....",   // H
			    "..",     // I
			    ".---",   // J
			    "-.-",    // K
			    ".-..",   // L
			    "--",     // M
			    "-.",     // N
			    "---",    // O
			    ".--.",   // P
			    "--.-",   // Q
			    ".-.",    // R
			    "...",    // S
			    "-",      // T
			    "..-",    // U
			    "...-",   // V
			    ".--",    // W
			    "-..-",   // X
			    "-.--",   // Y
			    "--..",   // Z
			    ".----",  // 1
			    "..---",  // 2
			    "...--",  // 3
			    "....-",  // 4
			    ".....",  // 5
			    "-....",  // 6
			    "--...",  // 7
			    "---..",  // 8
			    "----.",  // 9
			    "-----",   // 0
			    " "
			  };

			static String alphabet = "abcdefghijklmnopqrstuvwxyz1234567890 ";
	
	static String encode(String txt)
	{
		String res = "";
		for (char ch : txt.toCharArray())
		{
			int idx = alphabet.indexOf(ch);
			String m = morsecode[idx];
			res += m + "|";
		}
		return res;
	}
	
	static int findMorseIdx(String m)
	{
		for (int i = 0; i < morsecode.length; i++) {
			if (m.equals(morsecode[i]))
				return i;	
		}
		return -1;
	}
	static String decode(String txt)
	{
		String res = "";
		//Zerteile den Morsestring anhand von "|"
		String[] p = txt.split("\\|");
		//Finde die Stelle des Morsezeichens in morsecode
		for (String m : p)
		{
			int idx = findMorseIdx(m);
			res += alphabet.charAt(idx);
		}
		return res;
	}
	
	public static void main(String[] args) {
		String m = encode("das ist ein text");
		System.out.println(m);
		String d =  decode(m);
		System.out.println(d);

	}

}
