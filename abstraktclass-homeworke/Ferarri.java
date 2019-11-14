public class Ferarri extends Auto{

    public Ferarri(int speed) {
        super(speed);
    }
    @Override
    public void fahren()
    {
        System.out.print("Ich fahre: ");
        System.out.print(speed);
        System.out.println(" km/h");
    }


}