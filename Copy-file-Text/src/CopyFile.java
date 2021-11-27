import java.io.File;

import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

public class CopyFile {
    private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath());
    }
    public static void main(String[] args) throws InterruptedException, IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" input your source link: ");
        String inLink = scanner.nextLine();
        System.out.println("input your destination: ");
        String outLink = scanner.nextLine();
        File source = new File(inLink);
        File dest = new File(outLink);
        if(source.exists() && dest.exists()) {
            copyFileUsingJava7Files(source, dest);
            System.out.println("Copy Done");
        }else
            System.out.println("source or destination existed");
    }
}