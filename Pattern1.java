package com.company;

import static com.company.Utils.print;

/*
       Pattern1:
        1
       232
      34543
     4567654
    567898765
         */
public class Pattern1 {
    public static void main(String[] args) {
        int k;
        for (int i = 1; i <= 5; i++) {
            k = i;
            for (int j = 1; j <= 9; j++) {
                if (j >= 6 - i && j <= 4 + i) {
                    print(k);
                    if (j < 5) k++;
                    else k--;
                } else
                    print(" ");
            }
            print("\n");
        }
    }
}
