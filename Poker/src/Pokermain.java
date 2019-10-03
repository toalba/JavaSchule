
public class Pokermain {

	public static void main(String[] args) {
		Give gg =new Give(); 
		int analyticTimes=10000;
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
		


		for(int i=0;i<analyticTimes;i++)
		{
			boolean abbr= true;
			gg.gettoHand();
			
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
		    String returnString=gg.pair();
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
				case "pairs":
				pairCounter++;
				case "highCard":
				highcardCounter++;

			}
			}
		}

		// Analytics
		// Controll
	
		System.out.printf("Flush:%d",(flushCounter*100)/analyticTimes);
		System.out.println("%");
		System.out.printf("Straight:%d",(straightCounter*100)/analyticTimes);
		System.out.println("%");
		System.out.printf("Pairs:%d",(pairCounter*100)/analyticTimes);
		System.out.println("%");
		System.out.printf("Tripple: %d",trippleCounter*100/analyticTimes);
		System.out.println("%");
		System.out.printf("RoyalFlush: %d",royalflush*100/analyticTimes);
		System.out.println("%");
		System.out.printf("Doublepair: %d",doublePairCounter*100/analyticTimes);
		System.out.println("%");
		System.out.printf("HighCard: %d",highcardCounter*100/analyticTimes);
		System.out.println("%");
		System.out.printf("Fullhouse: %d",fullHouseCounter*100/analyticTimes);
		System.out.println("%");
		System.out.printf("Squad: %d",fourthCounter*100/analyticTimes);
		System.out.println("%");
		System.out.printf("StraightFlush: %d", straightflushCounter*100/analyticTimes);
		System.out.println("%");

	}

}
