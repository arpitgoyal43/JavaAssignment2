package com.company;

import java.util.Scanner;

import static com.company.Utils.println;

public class SumOfArray {
    public static void main(String[] args) {
        try {
            Scanner inputValue = new Scanner(System.in);
            println("Enter number of elements in array: ");
            int arraySet_size = inputValue.nextInt();
            int[] arraySet = new int[arraySet_size];
            println("Enter the elements in a sequence: ");
            for (int i = 0; i < arraySet_size; i++) {
                arraySet[i] = inputValue.nextInt();
            }
            //  Check for the size of array if less than 2, then the element itself is the sum
            if (arraySet.length < 2) {
                println("\nSum of Array: " + arraySet[0]);
            } else {
                // Object of SumOfArray class to call instance method
                SumOfArray sumofarray = new SumOfArray();
                // calling instance method sumOfArray([array]);
                println("Sum of array: " + sumofarray.sumOfArrray(arraySet));
            }
        } catch (Exception e) {
            println("Please enter a valid number!");
        }

    }

    /*
    sumOfArray ([array set]) method to sum all the elements of an array
    Input: array set
    Output: return a sum of all elements of array
     */
    public int sumOfArrray(int[] arraySet) {
        int sumOfArray = 0;
        // Enhanced for loop
        for (int value : arraySet) {
            sumOfArray += value;
        }
        return sumOfArray;
    }
}
