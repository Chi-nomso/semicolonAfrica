package Chapter17Exercises;

import java.util.function.DoubleBinaryOperator;

public class SeventeenA {
    public static void main(String[] args) {
        //a) Write a lambda expression that receives two double parameters a and b and returns their
        //product. Use the lambda form that explicitly lists the type of each parameter.
        DoubleBinaryOperator firstOperation = (double one, double two) -> {return one * two;};

        //b) Rewrite the lambda expression in Part (a) using the lambda form that does not list the
        //type of each parameter.
        DoubleBinaryOperator secondOperation = (one, two) ->  {return one * two;};

        //c) Rewrite the lambda expression in Part (b) using the lambda form that implicitly returns
        //the value of the lambda’s body expression.
        DoubleBinaryOperator thirdOperation = (one, two) ->  one * two;


    }
}
