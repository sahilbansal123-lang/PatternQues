package Advance_Patterns;

import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {

//        Butterfly Pattern

//        *                 *
//        * *             * *
//        * * *         * * *
//        * * * *     * * * *
//        * * * * * * * * * *
//        * * * * * * * * * *
//        * * * *     * * * *
//        * * *         * * *
//        * *             * *
//        *                 *



        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row = in.nextInt();
//        System.out.print("Enter number of cols: ");
//        int col = in.nextInt();

//        First Half -
//        Upper Half
        for (int i = 1; i <= row; i++){

            // 1st part
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            // spaces
            int spaces = 2 * (row - i);
            for (int j = 1; j<= spaces; j++){
                System.out.print("  ");
            }
            // 2nd part
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
//
//        // Second half - Lower part
        for (int i = row; i >= 1; i--){

            // 1st part
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            // spaces
            int spaces = 2 * (row-i);
            for (int j = 1; j <= spaces; j++){
                System.out.print("  ");
            }
            // 2nd part
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
