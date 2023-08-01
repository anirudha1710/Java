package Searching_and_Sorting;

import java.util.Arrays;
import java.util.Scanner;

/*
You are given an integer array/list(ARR) of size N.
It contains only 0s, 1s and 2s. Write a solution to sort this array/list in a 'single scan'.
'Single Scan' refers to iterating over the array/list just once
or to put it in other words, you will be visiting each element in the array/list just once.
Note:
You need to change in the given array/list itself. Hence, no need to return or print anything.
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains an integer 'N' representing the size of the array/list.

Second line contains 'N' single space separated integers(all 0s, 1s and 2s) representing the elements in the array/list.

Output Format :
For each test case, print the sorted array/list elements in a row separated by a single space.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^2
0 <= N <= 10^5
Time Limit: 1 sec

Sample Input 1:
1
7
0 1 2 0 2 0 1
Sample Output 1:
0 0 0 1 1 2 2

Sample Input 2:
2
5
2 2 0 1 1
7
0 1 2 0 1 2 0
Sample Output 2:
0 1 1 2 2
0 0 0 1 1 2 2
*/
public class Sort {
    public static int[] TakeUserInput() {

        Scanner s = new Scanner(System.in);
        System.out.print("\nEnter size of array: ");
        int size = s.nextInt();

        int[] arr = new int[size];

        System.out.print("\nEnter array element: ");
        for (int i = 0; i < size; i++) {

            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static int[] Sort_012(int[] arr){

        int nextZero=0;
        int nextTwo= arr.length-1;
        int i=0;

        while (i<=nextTwo){
            if (arr[i]==0){
                //Swapping:
                int temp=arr[nextZero];
                arr[nextZero]=arr[i];
                arr[i]=temp;
                i++;
                nextZero++;
            }
            else if (arr[i]==2){
                //Swapping:
                int temp=arr[nextTwo];
                arr[nextTwo]=arr[i];
                arr[i]=temp;

                nextTwo--;
            }
            else
                i++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr=TakeUserInput();
        System.out.println("Sorted Array: "+ Arrays.toString(Sort_012(arr)));
    }
}
