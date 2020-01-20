package com.company;

import java.util.Scanner;

import static com.company.Utils.println;

public class ReplaceCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        println("Enter any word: ");
        String word = input.nextLine();
        println("Enter character you want to replace from word: ");
        char oldchar = input.next().charAt(0);
        println("Enter new character: ");
        char newchar = input.next().charAt(0);
        // replaceChar() method returns either null or a required string
        if (replaceChar(word, oldchar, newchar) == null)
            println("No character to replace!");
        else
            // calling replaceChar() method to return new string
            println("New word: \n" + replaceChar(word, oldchar, newchar));
    }

    /*
    replaceChar([string],[char],[char]) method to replace user entered old character into a new entered character
    This method can be used whenever you make a error in inserting a text with incorrect character
     */
    public static String replaceChar(String word, char oldchar, char newchar) {
        // to char array
        char[] wordArray = word.toCharArray();
        int count = 0;
        for (int i = 0; i < wordArray.length; i++) {
            if (oldchar == newchar) {
                break;
            } else {
                if (wordArray[i] == oldchar) {
                    wordArray[i] = newchar;
                    count++;
                }
            }
        }
        if (count == 0)
            // if oldchar is equals to newchar
            return null;
        else
            return String.valueOf(wordArray);
    }
}