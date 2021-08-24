package Chapter5Exercises;

public class AsterisksTriangle {
    public static void main(String[] args) {

        for(int row = 1; row <= 10; row++){
            for (int column = 1; column <= row ; column++){
                System.out.print("*");
            }
            for(int column =16-row; column>=0; column--){
                System.out.print(" ");
            }
            for (int column = 0; column <= 10-row; column++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();


        for (int row = 1; row <= 10; row++) {
            for (int column = 0; column < 10-row; column++) {
                System.out.print("*");
            }

            //for (int j = 0; j < i ; j++) {
             //   System.out.print(" ");
            //}
            System.out.println();
        }


        for (int row = 1; row <= 10; row++) {
            for(int i= 1; i < row;i++){
                System.out.print(" ");
            }
            for(int column = 10; column >= row; column--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();


        for(int row = 1; row <= 10; row++){
            for(int column = 10; column >row; column--){
                System.out.print(" ");
            }
            for(int i= 1; i <= row;i++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}

