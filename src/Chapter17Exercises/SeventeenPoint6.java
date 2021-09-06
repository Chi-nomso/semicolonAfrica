package Chapter17Exercises;

import java.util.ArrayList;
import java.util.function.DoubleBinaryOperator;

public class SeventeenPoint6 {
    public static void main(String[] args) {
        /** --> a) Write a lambda expression that receives two double parameters a and b and returns their
         product. Use the lambda form that explicitly lists the type of each parameter.
         */
        DoubleBinaryOperator firstDoubleBinary = (double one, double two) -> {return one * two;};

        /** --> b) Rewrite the lambda expression in Part (a) using the lambda form that does not list the
         type of each parameter.
         */
        DoubleBinaryOperator secondDoubleBinary = (one, two) ->  {return one * two;};

        /** --> c) Rewrite the lambda expression in Part (b) using the lambda form that implicitly returns
         the value of the lambda’s body expression.
         */
        DoubleBinaryOperator thirdDoubleBinary = (one, two) ->  one * two;

        /** --> d) Write a no-argument lambda that implicitly returns the string "Welcome to lambdas!".
         */
        //()-> System.out.println("Welcome to lambdas!");

        /** --> e) Write a constructor reference for class ArrayList.
         * */
        //ArrayList::new

    }
}
