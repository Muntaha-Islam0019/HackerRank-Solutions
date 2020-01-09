import java.util.*;


class Difference {

  	private int[] elements;
    public int maximumDifference;
      
    public Difference(int[] anArray) {
        elements = anArray;
        maximumDifference = 0;
    }

    int minimum = Integer.MAX_VALUE;
    int maximum = Integer.MIN_VALUE;

    public void computeDifference() {

        for (int i = 0; i < elements.length; i++) {

            if (elements[i] < minimum) {
                minimum = elements[i];
            }

            if (elements[i] > maximum) {
                maximum = elements[i];
            }
        }

        maximumDifference = Math.abs(minimum - maximum);

        /* 
         * System.out.println("Min: " + minimum);
         * System.out.println("Max: " + maximum);
         * System.out.println("Diff: " + maximumDifference);
        */
    }
}

public class SolutionOfDay14InHackerRank {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}