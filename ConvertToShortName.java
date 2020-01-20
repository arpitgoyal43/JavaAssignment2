package com.company;

import java.util.Scanner;

import static com.company.Utils.print;
import static com.company.Utils.println;
import static java.lang.Character.toUpperCase;
import static java.lang.Character.toLowerCase;

public class ConvertToShortName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        println("Enter your Full name: ");
        String fullName = input.nextLine();
        boolean numeric = true;
        // checking if user enter a numeric string
        try {
            Double numericString = Double.parseDouble(fullName);
        } catch (NumberFormatException e) {
            numeric = false;
        }
        if (numeric)
            System.out.println(" Please enter a valid name");
        else {
            println("Short form of your name is: ");
            printShortName(fullName);
        }
    }

    /*
    printShortName([string]) method to print your name in short form
    Example: Abdul Kalam Ajad --> A. K. Ajad
     */
    public static void printShortName(String fullName) {
        // to store extracted word from full name each time
        StringBuilder initialName = new StringBuilder();
        // to remove any leading or trailing spaces from the string
        fullName = fullName.trim();
        for (int i = 0; i < fullName.length(); i++) {
            char wordCharacter = fullName.charAt(i);
            if (wordCharacter != ' ')
                // to form a complete word
                initialName.append(wordCharacter);
            else {
                // printing the first letter of the name in capital letters
                print(toUpperCase(initialName.charAt(0)) + ". ");
                initialName = new StringBuilder();
            }
        }
        StringBuilder surname = new StringBuilder();
        for (int j = 0; j < initialName.length(); j++) {
            if (j == 0)
                surname.append(toUpperCase(initialName.charAt(0)));
            else surname.append(toLowerCase((initialName.charAt(j))));
        }
        // printing the surname
        print(surname.toString());
    }
}
