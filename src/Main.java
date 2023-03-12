import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // квадрат

        //  for (int i = 1; i < 10; i++) {
        //      for (int j = 1; j < 10; j++) {
        //          System.out.print(" * ");
        //      }
        //      System.out.println();
        //  }

        // треугольник прямоугольный

        // for (int i = 1; i < 10; i++) {
        //     for (int c = 0; c < i; c++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // треугольник прямоугольный 2

        //     for (int i = 10; i >= 0; i--) {
        //         for (int c = 0; c < i; c++) {
        //             System.out.print("*");
        //         }
        //         System.out.println();
        //     }

        // треугольник равносторонний

    //   for (int i = 1; i <= 10; i++) {
    //       for (int c = 1; c <= 10 - i; c++) {
    //           System.out.print(" ");
    //       }
    //       for (int d = 1; d <= (i * 2) - 1; d++) {
    //           System.out.print("*");
    //       }
    //       System.out.println();
    //   }

        // ромб

        for (int i = 1; i <= 10; i++) {
            for (int c = 1; c <= 10 - i; c++) {
                System.out.print(" ");
            }
            for (int d = 1; d <= (i * 2) - 1; d++) {
                System.out.print("*");
            }
            System.out.println();
        }

       for (int i = 9; i >= 0; i--) {
           for (int c = 0; c <= 9 - i; c++) {
               System.out.print(" ");
           }
           for (int d = 1; d <= (i * 2) - 1; d++) {
               System.out.print("*");
           }
           System.out.println();
       }
    }


        }














