package Chapter9Exercise;

public class Fowl extends Birds{
    @Override
    public void fly(){
        System.out.println("Fly to the Pan");
    }

    public void parentFly(){
        super.fly();
    }
}
