package VariousPractice;

import java.util.Scanner;

public class VariousPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        int value = 1;
//        while(value <= 10){
//            System.out.println("Chinomso " + value);
//            value = value + 1;

//        int value = 1;
//        while(value <= 20){
//            System.out.println("I will Know Java " + value);
//            value = value + 3;

//        int number = 1;
//        while(number <= 50){
//            System.out.println("I am Intelligent " + number);
//            number = number +5;

//        for(int number = 1;number <=10; number++){
//            System.out.printf("I will know java %d%n", number);


//        int number = 0;\
//        do{
//        System.out.println("Put in a number ");
//        number = input.nextInt();
//    }while (number != 10);
//        System.out.println("Great!!");


//        int number = 0;
//        int remainder;
//        int reverse;
//        System.out.println("Enter your Number");
//        number = input.nextInt();
//        while( number != 0){
//            number= number  % 10;
//        }


//        int bill = 500;
//        int month = 0;
//        while(month < 10){
//            bill = bill + 100;
//            month = month + 1;
//            System.out.println(bill);
//        }
//        System.out.println("The bill for the " + month + " month is " + bill);

//        int bill = 500;
//        for(int  month = 0; month <= 10; month++){
//            bill= bill + 100;
//            System.out.println(bill);
//        }
//        System.out.printf("the tenth month bill is %d", bill);



//         int grade;
//         int total = 1;
//        System.out.println("Enter student grade");
//        grade = input.nextInt();
//        int counter = 1;
//         while(grade > 0){
//             System.out.println("Enter grade ");
//             grade = input.nextInt();
//             total= total + grade;
//             counter ++;
//         }double average = total*1.0 / counter;
//        System.out.printf("The sum of the students grade is %d%n", total);
//        System.out.printf("The average of the students Grade is %.2f%n and count is %d",average,counter);


//        Develop a class-averaging program that processes grades for an arbitrary number of
//        students each time it’s run

        int total=1;
        int counter = 1;
        System.out.println("Enter the student grade");
        int grade = input.nextInt();
        while(grade != -1){
            counter++;
            System.out.println("Enter grade");
    }
        double average = total/ counter;
        total = total + grade;
        System.out.printf("The total of the grades imputed are %d%n,the average is %.,2f%n,the count is %d%n", total,average,counter);
}
}
