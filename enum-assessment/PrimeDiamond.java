package task2;

import java.util.Scanner;

public class Triangle {
    static int a = 0;



   public static void main(String[] args) {

	   System.out.println("Enter no of rows ");
	   Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
       int c = 0;
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 1; j--) {



               System.out.print(" ");
            }
            int k[] = { 2, 3, 5, 7 };



           for (int l = 0; l <= c; l++) {
                if (a < 4) {
                    System.out.print(k[a]);
                    a++;
                } else {
                    a = 0;
                    System.out.print(k[a]);
                    a++;
                }
            }
            c += 2;
            a = 0;
            System.out.println();



       }
    }



}