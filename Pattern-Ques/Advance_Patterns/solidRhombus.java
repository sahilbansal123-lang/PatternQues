package Advance_Patterns;

import java.util.Scanner;

public class solidRhombus {
    public static void main(String[] args) {

//                 * * * *
//               * * * *
//             * * * *
//           * * * *


        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row = in.nextInt();
//        System.out.print("Enter number of cols: ");
//        int col = in.nextInt();

//        for (int i = row; i >= 1; i--) {
//            for (int j = 1; j <= i; j++){
//                System.out.print("  ");
//            }
//            for (int j = 1; j <= row; j++){
//                System.out.print("* ");
//            }
//            for (int j = 1; j <= i; j++){
//                System.out.print("  ");
//            }
//            System.out.println();
//        }

//        ---------------------------------------------------------------------

//                 * * * *
//               *     *
//             *     *
//           * * * *

        for (int i = row; i >= 1; i--) {
            for (int j = 1; j <= i; j++){
                System.out.print("  ");
            }
            for (int j = 1; j <= row; j++){
                if (i == 1 || j == 1 || i == row || j == row ){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            for (int j = i; j >= 1; j--){
                System.out.print("  ");
            }
            System.out.println();
        }


    }
}
