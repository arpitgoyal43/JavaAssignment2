package com.company;

import java.util.Scanner;

import static com.company.Utils.println;

public class PrimeNumber {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            println("Enter any number: ");
            int inputprime = input.nextInt();
            checkPrime(inputprime);
        } catch (Exception e) {
            println("Please enter a valid number!!");
        }
    }

    /*
    checkPrime([int]) method to print only prime numbers
     */
    public static void checkPrime(int inputprime) {
        boolean flag = false;
        for (int i = 2; i < inputprime / 2; i++) {
            // condition for non-prime
            if (inputprime % i == 0) {
                flag = true;
                break;
            }
        }
        if (flag)
            println(inputprime + " is not a prime number");
        else
            println(inputprime + " is a prime number");
    }
}