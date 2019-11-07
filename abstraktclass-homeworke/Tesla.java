public class Tesla extends Auto{

    int speed;
    public Tesla(int speed){
        this.speed=speed;
    }
    @Override
    public void fahren()
    {
        System.out.print("Ich fahre:");
        System.out.println(speed);
    }
}