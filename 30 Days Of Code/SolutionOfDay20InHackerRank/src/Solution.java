import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        // Write Your Code Here

        /*Arrays.sort(a);
        int firstElement = a[0];
        int lastElement = a[a.length - 1];
        int numOfSwaps = ??*/

        int firstElement;
        int lastElement;
        int numOfSwaps = 0;

        for(int i = 0; i < a.length; i++) {

            int swapCount = 0;

            for(int j = 0; j < a.length - 1; j++)
                if (a[j] > a[j + 1]) {
                    int temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                    swapCount++;
                    numOfSwaps++;
                }

            if(swapCount == 0) break;
        }

        /*Array is sorted in 0 swaps.
        First Element: 1
        Last Element: 3*/

        firstElement = a[0];
        lastElement = a[a.length - 1];

        System.out.println("Array is sorted in " + numOfSwaps + " swaps.");
        System.out.println("First Element: " + firstElement);
        System.out.println("Last Element: " + lastElement);
    }
}