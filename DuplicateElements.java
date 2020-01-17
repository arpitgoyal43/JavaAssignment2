package com.company;

import java.util.Scanner;

public class DuplicateElements {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter number of elements in array: ");
            int arraySet_size = input.nextInt();
            //  Check for the size of array if less than 2, then there is no duplicate element
            if (arraySet_size < 2) {
                System.out.println("No duplicate elements.");
            } else {
                // Integer array declaration
                int[] arraySet = new int[arraySet_size];
                System.out.println("Enter the elements in a sequence: ");
                for (int i = 0; i < arraySet_size; i++) {
                    arraySet[i] = input.nextInt();
                }
                System.out.println("Duplicate elements: ");
                // calling a static method printDuplicate([arrayset])
                DuplicateElements.printDuplicate(arraySet);

            }
        } catch (Exception e) {
            System.out.println("Please enter a valid number!");
        }
    }

    /*
    printDuplicate([array]) method to print duplicate elements
    Input: An array containing duplicates
    Output: Print only duplicate elements
     */
    public static void printDuplicate(int[] arraySet) {
        for (int i = 0; i < arraySet.length; i++)
            for (int j = i + 1; j < arraySet.length; j++)
                if (arraySet[i] == arraySet[j])
                    System.out.print(arraySet[j] + ",");
    }
}
