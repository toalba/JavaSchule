
public class Pokermain {

	public static void main(String[] args) {
		Give gg =new Give(); 
		int analyticTimes=1000;
		// Kartencounter
		int highcardCounter=0;
		int pairCounter=0;
		int trippleCounter=0;
		int fourthCounter=0;
		int fullHouseCounter=0;
		int flushCounter=0;
		int straightCounter=0;
		int straightflushCounter=0;
		int royalflush=0;


		for(int i=0;i<analyticTimes;i++)
		{
			gg.gettoHand();
		}

	}

}
