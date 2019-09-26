
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
        fill();
        for(int i = 0; i<=handrange;i++)
        {
            int lenght = cardDeck.length - i;
            int random = (int)(Math.random()*lenght);
            
            hand[i]= cardDeck[random];
            cardDeck[random]=cardDeck[cardDeck.length-i];
        }
    }
     //Section 2 ---  Done
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
    
        //Bubblesort
    public int[] handST = new int[handrange];
    public int[] bubbleSort()
    {
        for(int i=0;i<hand.length;i++)
        {
            handST[i]=hand[i]%13;
        }
        int temp;
        for(int i=0;i<hand.length;i++)
        {
            if(hand[i]>hand[i+1])
            {
                temp=handST[i];
                handST[i]=handST[i+1];
                handST[i+1]=temp;
                bubbleSort();
            }
        }

        return handST;

    }
    //Section 3 --- Analyze
    public String pair() 
    {
        int pairs=0;
        int tripple=0;
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
                 return "fourOfKind";
             }
        }
        if(pairs==2)
        {
            pairs=0;
            return "doublePair";
        }
        if(tripple==1 && pairs==1)
        {
            pairs=0;
            tripple=0;
            return "fullHouse";
        }
        if(tripple==1)
        {
            return "tripple";
        }
        if(pairs==1);
        {
        return "pairs";
        }
    }
    public boolean flush()
    {
        boolean i=false;
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
    }
    public boolean straight()
    {
        boolean a=false;
        bubbleSort();                        //Ass 13 && Ass 0 missing
        for(int i=0;i<handST.length;i++)
        {
            if(handST[i]+1==handST[i+1])
            {
                a=true;
            }    
        }
        if(a)
        {
            return true;
        }
        return false;   
    }
    public boolean straightFlushCeck()
    {

        if(flush()&&straight())
        {
            return true;
        }
        return false;
    }
    public boolean royalFlush()
    {
        if(flush()&&straight()&& hand[0]%13==7)
        {   
            return true;
        }
        return false;
    }
}   



