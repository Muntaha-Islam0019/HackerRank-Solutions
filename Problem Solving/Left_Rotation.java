import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Left_Rotation {

    private static void leftRotation(int[] arr) {
        
        int firstElement = arr[0];

        for(int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i+1];
        }

        arr[arr.length - 1] = firstElement;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        while(d-- != 0) leftRotation(a);

        for(int i: a) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}
