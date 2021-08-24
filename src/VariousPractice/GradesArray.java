package VariousPractice;

import java.security.SecureRandom;

public class GradesArray {
    public void grade(){
        int[]score = {0,0,0,0,0,0,1,2,4,2,1};
        System.out.println("Grade Display");

        for(int count= 0;count<score.length; count++){
            if(count == 10){
                System.out.printf("%5d:\n ",100);
            }
            else {
                System.out.printf("%02d - %02d:\n ",count * 10,count * 10+9);
            }
            for (int stars = 0; stars < score[count]; stars++) {
                System.out.println("#");
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        new GradesArray().grade();
    }
}
