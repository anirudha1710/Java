package Nested_loops;

import java.util.Scanner;

/*
 *
 ***
 *****
 *******
 *********

 */
public class Pattern12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int i=1;
        while (i<=n)
        {
            int space=1;
            while (space<=n-i)
            {
                System.out.print(" ");
                space++;
            }
            int star=1;
            while (star<=2*i-1)
            {
                System.out.print("*");
                star++;
            }
            System.out.println();
            i++;
        }
    }
}
