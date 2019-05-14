package net.machina.collections.sets;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class WordCounter {
    public static void main(String[] args) {
        Set<String> wordSet = new HashSet<>();
        try(Scanner s = new Scanner(new File("tadeusz.txt")))  {
            while(s.hasNext()) {
                String cleanWord = s.next().replaceAll("[^a-zA-Z]+", " ").toLowerCase().trim();
                if(cleanWord.contains(" ")) {
                    wordSet.addAll(Arrays.asList(cleanWord.split("\\s")));
                } else {
                    wordSet.add(cleanWord);
                }
            }
            System.out.printf("Unique word count: %d", wordSet.size());
        } catch(FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
    }
}