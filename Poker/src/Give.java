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
        Arrays.sort(hand);                       
        for(int i=0;i<hand.length-1;i++)
        {
            if(hand[i]+1==hand[i+1])
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
        if(flush()&&straight()&& (hand[0]%13==7))
        {   
            return true;
        }
        return false;
    }
    public boolean onePair()
    {
        decode();
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
    public boolean Squad()
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
        if(tripple()&&onePair())
        {
            return true;
        }
        return false;
    }
}   



