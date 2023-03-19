import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {

//        Half Pyramid With Numbers

//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5

        Scanner in = new Scanner(System.in);
//        System.out.print("Enter number of rows: ");
//        int row = in.nextInt();
        System.out.print("Enter number of cols: ");
        int col = in.nextInt();

//        for (int i = 1; i <= col; i++){
//            for (int j = 1; j <= i; j++){
//                System.out.print(j + " " );
//            }
//            System.out.println();
//        }

//        Inverted Half Pyramid


//        1 2 3 4 5
//        1 2 3 4
//        1 2 3
//        1 2
//        1

        for (int i = col; i >= 1; i--){
            for (int j = 1; j <= i; j++){
                System.out.print(j + " " );
            }
            System.out.println();

        }
    }
}
