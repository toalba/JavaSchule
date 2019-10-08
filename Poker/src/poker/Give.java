package poker;
import java.util.Arrays;
import java.util.Random;

public class Give {

    private static int handrange = 5;
    private int[] cardDeck= new int[52];
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
        for(int i = 0; i<handrange;i++)
        {
            int maxidx = cardDeck.length - i -1;
            Random generator = new Random(System.currentTimeMillis());
            int random = generator.nextInt(52-i);
            
            hand[i]= cardDeck[random];
            cardDeck[random]=cardDeck[maxidx];
            
        }
        decode();
    }
     //Section 2 ---  Done
    private boolean[][] handMat= new boolean[4][13];
    public void decode()
    {
        //zahl%13= kartenummer
        //zahl/13= farbe
        for(int i=0;i<=hand.length-1;i++)
        {
           handMat[hand[i]/13][hand[i]%13]= true;       
        }

    }
    
  
    //Section 3 --- Analyze

    public boolean flush()
    {
        boolean i=false;
            int[] flush=new int[handrange];
            for(int j=0;j<handrange;j++)
             {
                flush[j]=hand[j]/13;
             }
             for(int j=0;j<handrange-1;j++)
             {

                 if(flush[j]==flush[j+1])
                 {
                    i=true;
                 }
                 else
                 {
                     return i;
                 }
                 
            }
            return i;

    }
    public boolean straight()
    {
        boolean a=false;
        int[] sortet = new int [hand.length];
        sortet=hand;
        Arrays.sort(sortet);                       
        for(int i=0;i<sortet.length-1;i++)
        {
            if(sortet[i]+1==sortet[i+1])
            {
                a=true;
            }    
        }
        return a;
    }
    public boolean straightFlushCeck()
    {
        return flush()&&straight();
    }
    public boolean royalFlush()
    {
        return flush()&&straight()&&(hand[0]%13==7);
    }
    public boolean onePair()
    {
        
        for(int i=0;i<13;i++)
        {
            int counter=0;
            for(int j=0;j<4;j++)
             {
                if(handMat[j][i])
                {
                    counter++;
                }
                if(counter==2)
                {  
                   return true;
                }
             }

        }
        return false;

    }
    public boolean tripple()
    {
       
        for(int i=0;i<13;i++)
        {
            int counter=0;
            for(int j=0;j<4;j++)
             {
                if(handMat[j][i])
                {
                    counter++;
                }
                if(counter==3)
                {  
                   return true;
                }
             }

        }
        return false;

    }
    public boolean squad()
    {
      
        for(int i=0;i<13;i++)
        {
            int counter=0;
            for(int j=0;j<4;j++)
             {
                if(handMat[j][i])
                {
                    counter++;
                }
                if(counter==4)
                {  
                   return true;
                }
             }

        }
        return false;
    }
    public boolean doublePair()
    {
        int pair=0;
       
        for(int i=0;i<13;i++)
        {
            int counter=0;
            for(int j=0;j<4;j++)
             {
                
                if(handMat[j][i])
                {
                    counter++;
                }
                if(counter==2)
                {  
                   pair++;
                }
             }

        }
        if(pair==2)
        {
            return true;
        }
        return false;
    }
    public boolean fullHouse()
    {
        return tripple()&&onePair();
    }
}   



