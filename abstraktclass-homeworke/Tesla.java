public class Tesla extends Auto{

    
    public Tesla(int speed){
        super(speed);
    }
    @Override
    public void fahren()
    {
        System.out.print("Ich fahre:");
        System.out.println(speed);
    }
}