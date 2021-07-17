package africa.semicolon.tddClassPractice;

import java.util.Scanner;

public class DiaryApplication {
    private static  Diary diary = new Diary("My Wahala");
    public static void main(String... args) {

        Scanner input = new Scanner(System.in);
        String homePage = """
                1--> Add new Entry
                2--> Delete Entry
                3--> Find Entry By Title
                """;
        System.out.println(homePage);
        int userInput = input.nextInt();
        input.nextLine();
        switch (userInput){
            case 1:
                System.out.println("Wetin be entry name");
                String entryName = input.nextLine();
                System.out.println("Wetin be the body");
                String entryBody = input.nextLine();
                diary.addEntry(entryName,entryBody);
                System.out.println("success");
                System.out.println(diary.getAllEntries().toArray());
                main();
                break;
            case 2:
                System.out.println("Wetin you wan delete");
                String entryTitle = input.nextLine();
                diary.deleteEntryByTitle(entryTitle);
                System.out.println("success");
                main();
                break;
            case 3:
                System.out.println("Wetin you dey find");
                entryName = input.nextLine();
                Entry entry = diary.findEntryByTitle(entryName);
                System.out.println(entry);
                main();
                break;
            case 4:
                System.out.println("Bye bye");

            default:
                System.out.println();
        }
    }
}
