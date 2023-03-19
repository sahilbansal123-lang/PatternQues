import java.util.Scanner;

public class Ques2 {

//    HOLLOW RECTANGLE PATTERNS

//    * * * * * * * *
//    *             *
//    *             *
//    *             *
//    *             *
//    * * * * * * * *

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row = in.nextInt();
        System.out.print("Enter number of cols: ");
        int col = in.nextInt();

        for (int i = 0; i < col; i++){

            for(int j = 0; j < row; j++){
                if(i == 0 || j == 0 || i == col-1 || j == row-1){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
