package africa.semicolon.tddClassPractice;

import java.util.Scanner;

public class Katar {

    private int userInput;
    private int userInputBinary;

    public void setUserInput(int userInput) {
        this.userInput = userInput;
    }

    public int getUserInput() {
        return userInput;
    }

    public void setUserInputBinary(int userInputBinary) {
        int value;
        int modulo;
        value = userInput / 2;
        modulo = userInput % 2;

        this.userInputBinary = userInputBinary;
    }

    public int getUserInputBinary() {
        return userInputBinary;
    }
}
