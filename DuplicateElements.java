package com.company;

import java.util.Scanner;
import static com.company.Utils.println;
import static com.company.Utils.print;

public class DuplicateElements {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            println("Enter number of elements in array: ");
            int arraySet_size = input.nextInt();
            //  Check for the size of array if less than 2, then there is no duplicate element
            if (arraySet_size < 2) {
                println("No duplicate elements.");
            } else {
                // Integer array declaration
                int[] arraySet = new int[arraySet_size];
                println("Enter the elements in a sequence: ");
                for (int i = 0; i < arraySet_size; i++) {
                    arraySet[i] = input.nextInt();
                }
                println("Duplicate elements: ");
                // calling a static method printDuplicate([arrayset])
                DuplicateElements.printDuplicate(arraySet);

            }
        } catch (Exception e) {
            println("Please enter a valid number!");
        }
    }

    /*
    printDuplicate([array]) method to print duplicate elements
    Input: An array containing duplicates
    Output: Print only duplicate elements
     */
    public static void printDuplicate(int[] arraySet) {
        for (int i = 0; i < arraySet.length; i++) {
            int count=0;
            for (int j = i + 1; j < arraySet.length; j++) {
                if ((arraySet[i] == arraySet[j] && (i != j)))
                    count++;
            }
            if(count==1)
                println(arraySet[i]);
        }
    }
}
