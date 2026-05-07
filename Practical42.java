/*Write a program that will count the number of characters, words, and lines in a file. Words are separated by whitespace characters. The file name should be passed as a command-line argument.*/

import java.io.*;

public class Practical42 {
    public static void main(String[] args) {
        System.out.println("Ritika Pandey");
        System.out.println("En-roll: 240390107041");
        
        // Check command-line argument
        if (args.length != 1) {
            System.out.println("Usage: java Practical42 <filename>");
            return;
        }

        String fileName = args[0];

        int characters = 0;
        int words = 0;
        int lines = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;

            while ((line = br.readLine()) != null) {
                lines++;

                // Count characters
                characters += line.length();

                // Count words
                String[] wordArray = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    words += wordArray.length;
                }
            }

            br.close();

            System.out.println("File Name: " + fileName);
            System.out.println("Number of Characters: " + characters);
            System.out.println("Number of Words: " + words);
            System.out.println("Number of Lines: " + lines);

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } catch (IOException e) {
            System.out.println("Error while reading file.");
        }
    }
}