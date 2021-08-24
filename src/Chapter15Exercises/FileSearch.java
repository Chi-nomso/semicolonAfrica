package Chapter15Exercises;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileSearch {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your file or Directory name:");
        Path pat = Paths.get(input.nextLine());

        if(Files.exists(pat)){
            System.out.printf("%n%s exists%n", pat.getFileName());
            System.out.printf("%s a directory%n", Files.isDirectory(pat) ? "is" : "is not");
            System.out.printf("%s an absolute path%n", pat.isAbsolute() ? "is" : "is not");
            System.out.printf("Last modified: %s%n", Files.getLastModifiedTime(pat));
            System.out.printf("Size:%s%n", Files.size(pat));
            System.out.printf("Path: %s%n", pat);
            System.out.printf("Absolute path: %s%n", pat.toAbsolutePath());

            if(Files.isDirectory(pat)){
                System.out.printf("%nDirectory content: %n");
                DirectoryStream<Path>directoryStream = Files.newDirectoryStream(pat);
                for(Path p: directoryStream){
                    System.out.println(p);
                }
            }
            }
        else {
            System.out.printf("%s does not exist%n", pat);
        }
    }
}