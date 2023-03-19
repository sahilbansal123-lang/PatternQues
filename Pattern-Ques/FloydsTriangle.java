import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String[] args) {


//
//        1
//        2 3
//        4 5 6
//        7 8 9 10
//        11 12 13 14 15

        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row = in.nextInt();
//        System.out.print("Enter number of cols: ");
//        int col = in.nextInt();
//        int number = 1;
//
//        for(int i = 1; i <= row; i++){
//            for (int j = 1; j <= i; j++){
//                System.out.print(number + " ");
//                number++;
//            }
//            System.out.println();
//        }


//        --------------------------------------------------------------------------------

//        0-1 Triangle pattern problen

//        1
//        0 1
//        1 0 1
//        0 1 0 1
//        1 0 1 0 1
//        0 1 0 1 0 1

          for (int i = 1; i <= row; i++){
              for (int j = 1; j <= i; j++){
                  if((i + j) % 2 == 0){
                      System.out.print(1 + " ");
                  } else {
                      System.out.print(0 + " ");
                  }
              }
              System.out.println();
          }

    }
}
