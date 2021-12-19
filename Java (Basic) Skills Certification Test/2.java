import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result {

    /*
     * Complete the 'typeCounter' function below.
     *
     * The function accepts STRING sentence as parameter.
     */

    public static void typeCounter(String sentence) {

        String[] strings = sentence.split("\\s+");
        
        int intCount = 0, doubleCount = 0, stringCount = 0;
        
        for (String aString : strings) {
            if (aString.contains(".")) doubleCount++;
            else {
                try {
                    int i = Integer.parseInt(aString);
                    intCount++;
                } catch (Exception e) {
                    stringCount++;
                }
            }
        }
        
        System.out.println("string " + stringCount);
        System.out.println("integer " + intCount);
        System.out.println("double " + doubleCount);
    }

}
class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String sentence = bufferedReader.readLine();

        Result.typeCounter(sentence);

        bufferedReader.close();
    }
}
