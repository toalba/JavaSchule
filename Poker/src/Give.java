
public class Give {

    private static int handrange = 5;
    private int[] cardDeck= new int[51];
    private int[] hand = new int[handrange];
    
    //Section 1 -- Done
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
            int lenght = cardDeck.length - i;
            int random = (int)(Math.random()*lenght);
            
            hand[i]= cardDeck[random];
            cardDeck[random]=cardDeck[cardDeck.length-i];
        }
    }
     //Section 2 ---Work in Progress
    private boolean[][] handMat= new boolean[4][13];
    public void decode()
    {
        //zahl%13= kartenummer
        //zahl/13= farbe
        for(int i=0;i<hand.length;i++)
        {
            handMat[hand[i]/13][hand[i]%13]= true;
        }

    }
    public void pair()
    {
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<13;j++)
             {

             }
        }
    }

}
