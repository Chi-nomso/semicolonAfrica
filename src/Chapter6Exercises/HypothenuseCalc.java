package Chapter6Exercises;

public class HypothenuseCalc {
    public double hypothenuse(double side1, double side2){
        double power = Math.pow(side1, 2)+ Math.pow(side2, 2);
        double root = Math.sqrt(power);
        return root;
    }

}
