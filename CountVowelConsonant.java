package com.company;

import javax.swing.*;
import java.util.Scanner;

import static com.company.Utils.println;

public class CountVowelConsonant {

    // main() method
    public static void main(String[] args) {
        try {
            //  println() method to print any data [
            println("Enter any word: ");
            Scanner input = new Scanner(System.in);
            char[] checkString = input.nextLine().toCharArray();
            countVowelConsonant(checkString);
        } catch (Exception e) {
            println("Please enter valid input!");
        }
    }

    /*
    countVowelConsonant([char array]) method to count vowels and consonants
    Input: character array
    Output: Print vowel count and consonant count
     */
    public static void countVowelConsonant(char[] checkString) {
        char alphabet;
        int countVowel = 0, countConsonant = 0;
        for (int i = 0; i < checkString.length; i++) {
            alphabet = checkString[i];
            if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u' || alphabet == 'A' || alphabet == 'I' || alphabet == 'E' || alphabet == 'O' || alphabet == 'U')
                countVowel++;
            else if (alphabet >= 'a' && alphabet <= 'z' || alphabet >='A' && alphabet<='Z' )
                countConsonant++;
        }
        println("Number of vowels and consonant:\n" + countVowel + "\n" + countConsonant);
    }
}



