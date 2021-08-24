package VariousPractice;

public class ReverseNumber {
    public static void main(String[] args) {
        /* want to loop through the characters of this string
            reverse the string
            add space when
        */
        String phoneNumber = "68573565 432+";
        for(int i = phoneNumber.length() - 1; i >= 0 ; i--) {
            System.out.print(phoneNumber.charAt(i));
            int space;
            if(i == phoneNumber.length()-1){
                space = i - 1; //phoneNumber.length()-1;
            }else{
                space = i+1;
            }
            if (space % 3 == 0) {
                System.out.print(" ");
            }
        }

    }
}
