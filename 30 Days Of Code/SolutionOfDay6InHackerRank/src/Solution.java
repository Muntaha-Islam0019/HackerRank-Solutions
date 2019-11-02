import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();

        while(testCases > 0) {

            String str = sc.next();
            String [] arr = str.split("");

            String [] oddArr;
            String [] evenArr;

            if (arr.length % 2 == 0) {
                oddArr = new String [arr.length / 2];
                evenArr = new String [arr.length / 2];
            } else {
                oddArr = new String [arr.length / 2];
                evenArr = new String [arr.length / 2 + 1];
            }

            for(int i = 0, indexForOdds = 0, indexForEvens = 0; i < arr.length; i++) {
                if(i % 2 == 0) {
                    evenArr[indexForEvens] = arr[i];
                    indexForEvens++;
                } else {
                    oddArr[indexForOdds] = arr[i];
                    indexForOdds++;
                }
            }

            String answer = "";

            for (String s : evenArr) {
                answer += s;
            }

            answer += " ";

            for (String s : oddArr) {
                answer += s;
            }

            System.out.println(answer);

            testCases--;
        }
    }
}
