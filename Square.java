//  Square of stars

package com.company;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        // This is for the first line
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println();
        // This is for the next lines
        for (int k = 1; k < n - 1; k++) {

        for (int j = 1; j <= n; j++){

            if (j == 1 || j == n){
                System.out.print("*");
            }
            else {
                System.out.print(" ");
            }

        }

            System.out.println();
        }

    //This is for the last line
    for (int l = 1; l <= n; l++){
        System.out.print("*");
    }


    }

}



