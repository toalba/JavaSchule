import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
public class Exception {

    

    public static void main(String[] args) throws IOException {
        try{
            String text = new String(Files.readAllBytes(Paths.get("/home/toalba/git/Javaschule/Exceptions/bsp.txt")), StandardCharsets.UTF_8);
            String[] arraynumbers = text.split(" ");
            int[] array= new int[Integer.parseInt(arraynumbers[0])];
            for(int count=1; count <= array.length-1;count++)
            {
              array[count-1]= Integer.parseInt(arraynumbers[count]);
            }  

            float[] arraynummber= new float[5];
        for(int i=0;i<=Integer.parseInt(arraynumbers[0]);i++)
        {
            arraynummber[i]=array[i];
        }
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Du musst mir auch sagen wo das File ist, sonst kann ich es nicht einlesen!");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("OB DU DUMM BIST, dein eingelesene Wertemenge ist größer als das Array!");
        }
        catch(NumberFormatException e)
        {
            System.out.println("HALLOOO, hast du nicht in Mathe aufgepasst? Nur natürliche Zahlen!");
        }
        
        

    }
}