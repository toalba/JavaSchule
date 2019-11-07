public class Ferarri extends Auto{

    int speed;
    public Ferarri(int speed){
        this.speed=speed;
    }
    @Override
    public void fahren()
    {
        System.out.print("Ich fahre:");
        System.out.println(speed);
    }


}