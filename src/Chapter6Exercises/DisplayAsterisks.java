package Chapter6Exercises;

public class DisplayAsterisks {
    public int squareOfAsterisks(int row, int column) {
        int side = 5;
        for (row = 1; row <= side; row++) {
            System.out.print("*");
            for(column = 1; column < side; column++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return side;
    }

    public static void main(String[] args) {
        System.out.print(new DisplayAsterisks().squareOfAsterisks(5,5));
    }
}
