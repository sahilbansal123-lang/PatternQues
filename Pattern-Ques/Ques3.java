import java.util.Scanner;

public class Ques3 {



    public static void main(String[] args) {

//    Half Pyramid Pattern

//    *
//    * *
//    * * *
//    * * * *
//    * * * * *

        Scanner in = new Scanner(System.in);
//        System.out.print("Enter number of rows: ");
//        int row = in.nextInt();
        System.out.print("Enter number of cols: ");
        int col = in.nextInt();

//        for(int i = 1; i <= col; i++){
//            for(int j = 1; j <= i; j++){
//                System.out.print("* ");
//            }
//            System.out.println("  ");
//        }

//        ----------------------------------------------------------------

//        Inverted Half Pyramid

//          * * * * *
//          * * * *
//          * * *
//          * *
//          *

//        for(int i = col; i >= 1; i--){
//            for(int j = 1; j <= i; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


//        ----------------------------------------------------------------

//        Inverted Half Pyramid

//                  *
//                * *
//              * * *
//            * * * *
//          * * * * *

        for(int i = 1; i <= col; i++){

            for(int j = 1; j <= col-i; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
