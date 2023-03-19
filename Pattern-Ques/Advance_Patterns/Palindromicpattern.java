package Advance_Patterns;

import java.util.Scanner;

public class Palindromicpattern {
    public static void main(String[] args) {

//        Palindrome numbers are the numbers that are same from both end

//                      1
//                    2 1 2
//                  3 2 1 2 3
//                4 3 2 1 2 3 4
//              5 4 3 2 1 2 3 4 5



        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row = in.nextInt();
//        System.out.print("Enter number of cols: ");
//        int col = in.nextInt();

        for (int i = 1; i <= row; i++){
            // spaces
            for(int j = 1; j <= row - i; j++){
                System.out.print("  ");
            }
//            palindrome number

            // first half number
            for(int j = i; j >= 1; j--){
                System.out.print(j + " ");
            }
            // second half number
            for(int j = 2; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();

        }
    }
}
