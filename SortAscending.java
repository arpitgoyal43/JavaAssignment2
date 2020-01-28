package com.company;

import java.util.Scanner;

import static com.company.Utils.println;
import static com.company.Utils.print;

public class SortAscending {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            println("Enter number of elements in array: ");
            int arraySet_size = input.nextInt();
            // Integer array declaration
            int[] arraySet = new int[arraySet_size];
            println("Enter the elements in a sequence: ");
            for (int i = 0; i < arraySet_size; i++) {
                arraySet[i] = input.nextInt();
            }
            println("Current array: ");
            // Enhanced for loop to print the elements in an array
            for (int i : arraySet) print(i + " ");
            //  Check for the size of array if less than 2, then it is already sorted
            if (arraySet.length < 2) {
                println("\nSorted Array: " + arraySet[0]);
            } else {
                // Object of SortAscending class to call instance method
                SortAscending sortAscendingArray = new SortAscending();
                // calling instance method sortArray([array])
                sortAscendingArray.sortArray(arraySet);
            }
        } catch (Exception e) {
            println("Please enter a valid number!");
        }

    }

    /*
        sortArray() method to print array in ascending order
        Input: An array set contain multiple elements in unordered manner
        Output: An sorted array in ascending order
      */
    public void sortArray(int[] arraySet) {

        int tempSwap;
        for (int i = 0; i < arraySet.length; i++) {
            for (int j = i + 1; j < arraySet.length; j++) {
                if (arraySet[i] > arraySet[j]) {
                    tempSwap = arraySet[i];
                    arraySet[i] = arraySet[j];
                    arraySet[j] = tempSwap;
                }
            }
        }
        println("\nSorted array in ascending order: ");
        /* Enhanced for loop to print the elements in an array */
        for (int i : arraySet) print(i + " ");
    }
}