package Loops;

import java.util.Scanner;

public class Digit_in_reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int r;
        while(n>0){
            r=n%10;
            n=n%10;
            System.out.println(r);
        }
        sc.close();
    }
}