/*
 * First Solution. Cauess error in test case 7 & 8.
 * 
 * import java.util.*;
 * 
 * public class SolutionOfDay25InHackerRank {
 * 
 * // Using Sieve of Eratosthenenes private static void primeOrNot(int number) {
 * 
 * boolean[] primeOrNot = new boolean[number + 1];
 * 
 * primeOrNot[1] = true;
 * 
 * for (int i = 2; i * i <= number; i++) { if (primeOrNot[i] == false) { for
 * (int j = i * 2; j <= number; j += i) { primeOrNot[j] = true; } } }
 * 
 * if (primeOrNot[number] == false) { System.out.println("Prime"); } else {
 * System.out.println("Not prime"); } }
 * 
 * public static void main(String[] args) {
 * 
 * Scanner scanner = new Scanner(System.in);
 * 
 * int testCases = scanner.nextInt();
 * 
 * while (testCases > 0) {
 * 
 * int anInt = scanner.nextInt();
 * 
 * primeOrNot(anInt);
 * 
 * testCases--; }
 * 
 * scanner.close(); } }
 */

import java.util.*;

public class SolutionOfDay25InHackerRank {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt();

        while (testCases > 0) {

            int anInt = scanner.nextInt();
            int sq = (int) Math.sqrt(anInt);
            boolean flag = true;

            if (anInt == 1 || anInt == 0) {
                System.out.println("Not prime");
            } else {

                for (int i = 2; i <= sq; i++) {
                    if (anInt % i == 0) {
                        System.out.println("Not prime");
                        flag = false;
                        break;
                    }
                }

                if (flag) {
                    System.out.println("Prime");
                }
            }

            testCases--;
        }

        scanner.close();
    }
}