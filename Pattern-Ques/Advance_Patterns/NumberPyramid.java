package Advance_Patterns;

import java.util.Scanner;

public class NumberPyramid {

    public static void main(String[] args) {

//                     1
//                    2 2
//                   3 3 3
//                  4 4 4 4
//                 5 5 5 5 5

        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row = in.nextInt();
//        System.out.print("Enter number of cols: ");
//        int col = in.nextInt();


        for (int i = 1; i <= row; i++){
            // spaces
            for (int j = 1; j <= row - i; j++){
                System.out.print(" ");
            }
            // number
            for (int j = 1; j <= i; j++){
                System.out.print( i + " ");
            }
            System.out.println();
        }

    }
}

