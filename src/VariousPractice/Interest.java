package VariousPractice;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year ");
        int years;
        years = input.nextInt();
        int capital = 1000;
        double rate = 7 / 100;
        double next=0;
        for(years = 0; years <= 30;years = years+10){
            next =  Math.pow(capital * (1 + rate), years);
            System.out.println(next);
        }
    }
}
