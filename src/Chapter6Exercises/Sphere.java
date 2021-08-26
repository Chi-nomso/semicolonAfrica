package Chapter6Exercises;

import java.util.Scanner;

public class Sphere {
    public static double sphereVolume(double radius){
        double volume = (4.0/3.0) * Math.pow(radius, 3);
        return volume;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius = input.nextDouble();
        System.out.println(Sphere.sphereVolume(radius));
    }
}
