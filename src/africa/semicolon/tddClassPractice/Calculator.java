package africa.semicolon.tddClassPractice;

public class Calculator {
    public int add(int firstNumber, int secondNumber) {
        int sum = firstNumber + secondNumber;
        return sum;


    }

    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public double divide(double firstNumber, double secondNumber){
    double division = firstNumber / secondNumber;
    if (firstNumber == 0){
        return 0;
        }else if (secondNumber == 0){
        return 0;
    }else
        return division;
    }
}
