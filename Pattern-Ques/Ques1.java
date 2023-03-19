import java.util.Scanner;

public class Ques1 {

//    Pattern 1

//    * * * * * * *
//    * * * * * * *
//    * * * * * * *
//    * * * * * * *
//    * * * * * * *



    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row = in.nextInt();
        System.out.print("Enter number of cols: ");
        int col = in.nextInt();

        // Outer Loop
        for(int i = 0; i < col; i++){
            // Inner Loop
            for (int j = 0; j < row; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
