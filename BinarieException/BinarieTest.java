
import java.util.Scanner;

public class BinarieTest{
    

    public static void main(String[] args) {
        try{
        String binarzahl;
        int dezimale;
        Scanner s = new Scanner(System.in);
        binarzahl = s.toString();
        s.close(); 
        if(!binarzahl.matches("[0-1]+")) throw new BinarieException();
        dezimale=Integer.parseInt(binarzahl,2);
        System.out.println(dezimale);
          
        }
        catch(BinarieException e)
        {
            System.out.println("Zahl ist nicht Binär");
        }
    }
}