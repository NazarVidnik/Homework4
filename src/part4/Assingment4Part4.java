package part4;

import java.util.Scanner;

public class Assingment4Part4 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int f = cin.nextInt();
        for (int rows = 0; rows < f; rows++) {// main cycle
            if (rows == 0 || rows == f-1 ){ //the first and last row to put +--+
                System.out.print("+");
                for (int i = 0; i <= f * 2+1; i++) { //value in the middle to put -
                   System.out.print("-");
                }
                System.out.println("+");
            }
            else {
                for (int i = 0; i <= f+2; i++) { // cycle for other rows
                   if (i==0 ){// start and finish with |
                       System.out.print("|");
                   }
                   else if (i==f +2) {
                       System.out.println("|");
                   }
                   else{
                    System.out.print("  ");
                   }
                }
            }
        }
    }
}
