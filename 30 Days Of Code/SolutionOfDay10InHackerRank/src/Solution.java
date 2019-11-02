import java.util.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    private static String binaryMaker (int i) {

        if (i != 0) {

            String str = "";

            while (i > 0) {
                str += Integer.toString(i%2);
                i /= 2;
            }

            StringBuilder sb = new StringBuilder(str);
            sb.reverse();

            str = sb.toString();

            return str;
        } else {
            return "0";
        }
    }

    public static void main(String[] args) {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String [] str = binaryMaker(n).split("");

        int count = 0;
        int maxCount = 0;

        for (String s : str) {
            if(s.equals("1")) {
                count++;
            } else {
                if (count > maxCount) maxCount = count;
                count = 0;
            }
        }

        System.out.println((count>maxCount)?count:maxCount);

        scanner.close();
    }
}
