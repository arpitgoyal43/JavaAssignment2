package com.company;

import java.util.Scanner;

import static com.company.Utils.print;
import static com.company.Utils.println;

/*
      Pattern2:
            *
           **
          ***
         ****
        *****
        */
public class Pattern2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        println("Enter the pattern size (here number of lines in rows and column are same): ");
        int patternSize = input.nextInt();
        for (int i = 1; i <= patternSize; i++) {
            for (int j = 1; j <= patternSize; j++) {
                if (j > patternSize - i)
                    print("*");
                else
                    print(" ");
            }
            print("\n");
        }
    }
}
