import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Java_Regex {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

        in.close();
    }
}

class MyRegex {

    /*
     * Notes on Regex:
     *
     * - \\d{1,2} -> catches any one or two digit number,
     * 
     * - (0|1)\\d{2} -> catches any three digit number starting with 0 or 1,
     * 
     * - 2[0-4]\\d -> catches numbers between 200 and 249,
     * 
     * - 25[0-5] -> catches numbers between 250 and 255,
     * 
     * - \d -> digits in regular expressions.
     */

    String aString = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
    public String pattern = aString + "\\." + aString + "\\." + aString + "\\." + aString;
}
