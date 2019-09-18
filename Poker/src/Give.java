
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
     //Section 2 --- Nearly Done
    private boolean[][] handMat= new boolean[13][4];
    public void decode()
    {
        //zahl%13= kartenummer
        //zahl/13= farbe
        for(int i=0;i<hand.length;i++)
        {
            handMat[hand[i]/13][hand[i]%13]= true;
        }

    }
    //Section 3 --- Analyze
    public int pair()
    {
        int pairs=0;
        int tripple=0;
        int doublePair=0;
        int fullHouse=0;
        int fourOfKind=0;
        decode();
        for(int i=0;i<13;i++)
        {
            int counter=0;
            for(int j=0;j<4;j++)
             {
                if(handMat[i][j])
                {
                    counter++;
                }
             }
             if(counter==2)
             {  
                pairs++;
             }
             else if(counter==3)
             {
                tripple++;
             }
             else if(counter==4)
             {
                 fourOfKind++;
                 return fourOfKind;
             }
        }
        if(pairs==2)
        {
            doublePair++;
            pairs=0;
            return doublePair;
        }
        if(tripple==1 && pairs==1)
        {
            fullHouse++;
            pairs=0;
            tripple=0;
            return fullHouse;
        }
        if(tripple==1)
        {
            return tripple;
        }
        if(pairs==1);
        {
        return pairs;
        }
    }
    public boolean flush()
    {
        
        boolean i;
            int[] flush=new int[handrange];
            for(int j=0;j<=handrange;j++)
             {
                flush[j]=hand[j]/13;
             }
             for(int j=0;j<handrange;j++)
             {

                 if(flush[j]==flush[j+1])
                 {
                    i=true;
                 }
                 else
                 {
                     i=false;
                 }
             }
        if(i)
        {
            return true;
        }
        else{
        return false;
        }
}}



