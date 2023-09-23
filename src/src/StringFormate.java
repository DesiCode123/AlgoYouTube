import java.io.PrintStream;
import java.util.Scanner;
/*
Input:
Sharmila
1

Output
==============================
Sharmila       0001
=============================
 */


public class StringFormate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Integer x = sc.nextInt();
        System.out.println("=====================");
        System.out.printf("%-15s%06d%n",input,x);
        System.out.println("=====================");

    }


}
