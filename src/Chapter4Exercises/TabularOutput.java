package Chapter4Exercises;

public class TabularOutput {
    public static void main(String[] args) {
        System.out.printf("%s|%18s|%18s|%19s|%n", "Num","Num*10","Num*100","Num*1000");
        System.out.println("_______________________________________________________________");
        int num = 1;
        while(num <= 5){
            System.out.printf("%d|%19d|%19d|%19d|%n", num, num*10,num*100,num*1000);
            num++;
        }
    }
}
