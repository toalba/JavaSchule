
public class Pokermain {

	public static void main(String[] args) {
		Give gg =new Give(); 
		int analyticTimes=1000;
		// Kartencounter
		int highcardCounter=0;
		int pairCounter=0;
		int trippleCounter=0;
		int fourthCounter=0;
		int doublePairCounter=0;
		int fullHouseCounter=0;
		int flushCounter=0;
		int straightCounter=0;
		int straightflushCounter=0;
		int royalflush=0;
		String returnString;


		for(int i=0;i<analyticTimes;i++)
		{
			boolean abbr= true;
			gg.gettoHand();
			returnString=gg.pair();
			if(gg.royalFlush() && abbr)
			{
				royalflush++;
				abbr=false;
			}
			if(gg.straightFlushCeck() && abbr)
			{
				straightflushCounter++;
				abbr=false;
			}
			if(gg.flush() && abbr)
			{
				flushCounter++;
				abbr=false;
			}
			if(gg.straight() && abbr)
			{
				straightCounter++;
				abbr=false;
			}
			if(abbr){
			switch(returnString)
			{
				case "fourOfKind":
				fourthCounter++;
				break;
				case "doublePair":
				doublePairCounter++;							
				break;
				case "fullHouse":
				fullHouseCounter++;
				break;
				case "tripple":
				trippleCounter++;
				break;
				case "pair":
				pairCounter++;
				default:
				highcardCounter++;

			}
			}
		}

		// Analytics

	}

}
