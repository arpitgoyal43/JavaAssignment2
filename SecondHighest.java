package com.company;

import java.util.Scanner;

import static com.company.Utils.println;

public class SecondHighest {
    /*
       secondHighest() method to get second highest element in an array
       Input: An array set contain multiple elements
       Output: Second Maximum value from the array set
       */
    public void secondHighest(int[] arraySet, int arraySet_size) {
        int firstMaximum = 0, secondMaximum = 0;
        for (int i = 0; i < arraySet_size; i++) {
            if (arraySet[i] > firstMaximum) {
                secondMaximum = firstMaximum;
                firstMaximum = arraySet[i];
            } else if (arraySet[i] > secondMaximum && arraySet[i] < firstMaximum) {
                secondMaximum = arraySet[i];
            }
        }
        println("Second Highest number: " + secondMaximum);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        println("Enter number of elements you want to use: ");
        int arraySet_size = input.nextInt();
        if (arraySet_size < 2)
            println("Invalid size!");
        else {
            int[] arraySet = new int[arraySet_size];
            println("Enter the elements in a sequence: ");
            for (int i = 0; i < arraySet_size; i++) {
                arraySet[i] = input.nextInt();
            }
            // secondHighestElement is the object of SecondHighest class
            SecondHighest secondHighestElement = new SecondHighest();
            // calling the secondHighest method
            secondHighestElement.secondHighest(arraySet, arraySet_size);
        }
    }
}
