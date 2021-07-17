package africa.semicolon.tddClassPractice;

import java.util.Scanner;

public class MyersBriggs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[]firstRow = {1,5,9,13,17};
        int[]secondRow ={2,6,10,14,18};
        int[]thirdRow = {3,7,11,15,19};
        int[]fourthRow = {4,8,12,16,20};
        String[]questions = {
                "A-expend energy, enjoy groups                                          B- conserve energy, enjoy one-on-one",
                "A- interpret literally                                                 B- look for meaning and possibilities",
                "A- logical, thinking, questioning                                      B- empathetic, feeling, accommodating",
                "A- organized, orderly                                                  B- flexible, Adaptable",
                "A- more outgoing, think out loud                                       B- more reserved, think to yourself",
                "A- practical, realistic, experiential                                  B-  imaginative, innovative, theoretical",
                "A- candid, straight forward, frank                                     B-  tactful, kind, encouraging",
                "A- plan, schedule                                                      B-  unplanned, spontaneous",
                "A- seek many tasks, public activities, interaction with others         B- seek private, solitary activities with quiet to concentrate",
                "A- standard, usual, conventional                                       B- different, novel, unique",
                "A- firm, tend to criticize, hold the line                              B- gentle, tend to appreciate, conciliate",
                "A- regulated, structured                                               B- easygoing, “live” and “let live",
                "A- external, communicative, express yourself                           B- internal, reticent, keep to yourself",
                "A- focus on here-and-now                                               B- look to the future, global perspective",
                "A- tough-minded, just                                                  B- tender-hearted, merciful",
                "A- preparation, plan ahead                                             B- go with the flow, adapt as you go",
                "A- active, initiate                                                    B- reflective, deliberate",
                "A- facts, things, “what is”                                            B- ideas, dreams, “what could be,” philosophical",
                "A- matter of fact, issue-oriented                                      B- sensitive, people-oriented, compassionate",
                "A- control, govern                                                     B-  latitude, freedom"};

        String[]response = new String[questions.length];
        String userInput;
        System.out.println("Kindly Select any of the Options A or B, to take your personality test:");
        System.out.println();
        for(int i = 0; i< questions.length; i++){
            System.out.println(questions[i]);

            do{
                userInput = input.next();
                if(!userInput.equalsIgnoreCase("a") && !userInput.equalsIgnoreCase("A") || !userInput.equalsIgnoreCase("b") && !userInput.equalsIgnoreCase("B"))
                    System.out.println("Invalid Option");
            }while(!userInput.equalsIgnoreCase("a") && !userInput.equalsIgnoreCase("b"));
            //String userInput = input.next();
            response[i] = userInput;
        }

        String result = String.format("%6s%6s%6s", " ","A", "B");
        System.out.println(result.repeat(4));
        System.out.println();
        for(int s = 0;s < 20; s = s + 4){
            if(response[s].equals("A") || response[s].equals("a")){
                System.out.printf("%6s%6s%6s",s + 1, '*', " ");
            }else
                System.out.printf("%6s%6s%6s", s + 1, " ", '*');
            if(response[s + 1].equals("A") || response[s].equals("a")){
                System.out.printf("%6s%6s%6s", s + 2, '*', " ");
            }else
                System.out.printf("%6s%6s%6s",s +2, " ", '*');
            if(response[s + 2].equals("A") || response[s].equals("a")){
                System.out.printf("%6s%6s%6s", s + 3, '*', " ");
            }else
                System.out.printf("%6s%6s%6s", s + 3, " ", '*');
            if(response[s + 3].equals("A") || response[s].equals("a")){
                System.out.printf("%6s%6s%6s", s + 4, '*', " ");
            }else
                System.out.printf("%6s%6s%6s", s + 4, " ", '*');
                System.out.println();
        }

        System.out.printf("%6s%6s%6s"," ","E","I");
        System.out.printf("%6s%6s%6s"," ","S","N");
        System.out.printf("%6s%6s%6s"," ","T","F");
        System.out.printf("%6s%6s%6s"," ","J","P");
        System.out.println();

        for(int i = 1; i <= 4; i++){
            if(i == 1){
                System.out.println(getRowResult(response,firstRow, 1));
                System.out.println("\t\t");
            }else if (i == 2){
                System.out.println(getRowResult(response,secondRow, 2));
                System.out.println("\t\t");
            }else if(i == 3){
                System.out.println(getRowResult(response, thirdRow,3));
                System.out.println("\t\t");
            }else{
                System.out.println(getRowResult(response, fourthRow,4));
                System.out.println("\t\t");
            }
        }
    }

    private static String getRowResult(String[] response, int[]question, int row) {
        int ACount = 0;
        int BCount = 0;
        String toReturn = "";
        for(int myersQuestion : question){
            String userAnswer = response[myersQuestion-1];
            if(userAnswer.equals("A")|| userAnswer.equals("a")){
                ACount++;
            }else {
                BCount++;
            }
        }
        if(ACount > BCount){
            if(row == 1){
                return "E";
            }else if(row == 2){
                return "S";
            }else if(row == 3){
                return "T";
            }else
            {return "J";
        }
    }else {
            if(row == 1){
                return "I";
            }else if(row == 2){
                return "N";
            }else if(row == 3){
                return "F";
            }else {
                return "P";
            }
        }
}
}
