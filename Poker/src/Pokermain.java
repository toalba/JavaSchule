
public class Pokermain {

	public static void main(String[] args) {
		
		double analyticTimes=100000;
		// Kartencounter
		double highcardCounter=0;
		double pairCounter=0;
		double trippleCounter=0;
		double squadCounter=0;
		double doublePairCounter=0;
		double fullHouseCounter=0;
		double flushCounter=0;
		double straightCounter=0;
		double straightflushCounter=0;
		double royalflush=0;
		


		for(int i=0;i<analyticTimes;i++)
		{
			Give gg =new Give(); 
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
			if(gg.Squad()&& abbr){
				
				squadCounter++;
				abbr=false;
			}
			if(gg.fullHouse()&& abbr)
			{
				flushCounter++;
				abbr=false;
			}
			if(gg.doublePair()&& abbr)
			{
				doublePairCounter++;
				abbr=false;
			}
			if(gg.tripple()&& abbr)
			{
				trippleCounter++;
				abbr=false;
			}
			if(gg.onePair()&& abbr)
			{
				pairCounter++;
				abbr=false;
			}
			if(abbr)
			{
				highcardCounter++;
				abbr= false;
			}
			
		}

		// Analytics
		// Controll
		System.out.print("Anzahl an Versuche:");
		System.out.println(analyticTimes);
		System.out.print("Gesamtanzahl:");
		System.out.println(flushCounter+straightCounter+straightflushCounter+pairCounter+trippleCounter+royalflush+doublePairCounter+highcardCounter+fullHouseCounter+squadCounter);
		System.out.printf("Flush:%f",(flushCounter*100)/analyticTimes);
		System.out.println("%");
		System.out.printf("Straight:%f",(straightCounter*100)/analyticTimes);
		System.out.println("%");
		System.out.printf("Pairs:%f",(pairCounter*100)/analyticTimes);
		System.out.println("%");
		System.out.printf("Tripple: %f",trippleCounter*100/analyticTimes);
		System.out.println("%");
		System.out.printf("RoyalFlush: %f",royalflush*100/analyticTimes);
		System.out.println("%");
		System.out.printf("Doublepair: %f",doublePairCounter*100/analyticTimes);
		System.out.println("%");
		System.out.printf("HighCard: %f",highcardCounter*100/analyticTimes);
		System.out.println("%");
		System.out.printf("Fullhouse: %f",fullHouseCounter*100/analyticTimes);
		System.out.println("%");
		System.out.printf("Squad: %f",squadCounter*100/analyticTimes);
		System.out.println("%");
		System.out.printf("StraightFlush: %f", straightflushCounter*100/analyticTimes);
		System.out.println("%");

	}

}
