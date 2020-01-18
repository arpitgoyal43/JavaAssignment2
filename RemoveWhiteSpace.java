package com.company;

import java.util.Scanner;

import static com.company.Utils.println;
import static com.company.Utils.print;

public class RemoveWhiteSpace {

    /*
        removeWhiteSpace() method to remove the white space from an string
        Input: character array containing all the elements of an string
        Output: print the string without any whiteSpace
         */
    static void removeWhiteSpace(char[] inputStringArray) {
        for (char stringChar : inputStringArray)
            if (stringChar != ' ')
                print(stringChar);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        println("Enter any String which contain white space: ");
        String inputString = input.nextLine();
        // converting an string into character array
        char[] inputStringArray = inputString.toCharArray();
        // calling an static method: removeWhiteSpace([input charArray]);
        removeWhiteSpace(inputStringArray);
    }
}
