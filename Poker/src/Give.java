
public class Give {

    private static int handrange = 5;
    private int[] cardDeck= new int[51];
    private int[] hand = new int[handrange];
    
    public void fill()
    {
        for(int i=0;i<cardDeck.length;i++)
        {
            cardDeck[i]=i;
        }
    }

    public void gettoHand()
    {
        
      

        for(int i = 0; i<handrange;i++)
        {
            int lenght = cardDeck.length - thrownCards;
            int thrownCards= 0;
            int random = (int)(Math.random()*lenght);
            
            hand[i]= cardDeck[random];
            cardDeck[random]=cardDeck[cardDeck.length-thrownCards];
            thrownCards++;


        }



    }


}