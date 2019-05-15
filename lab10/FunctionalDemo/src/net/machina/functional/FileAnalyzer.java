package net.machina.functional;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class FileAnalyzer {
    public static void main(String[] args) {
        File f = new File("/Users/machina/OneDrive");
        List<File> files = Arrays.asList(f.listFiles());
//        files.forEach(System.out::println);
        files.stream().filter(file -> file.isFile()).forEach(System.out::println);
        System.out.println(
                files.stream()
                .filter(file -> file.isFile())
                .mapToInt(file -> (int) file.length())
                .sum()
        );
    }
}
