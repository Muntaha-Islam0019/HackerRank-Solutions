import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {
    
    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */
    
    public static String findDay(int month, int day, int year) {

        Calendar c = Calendar.getInstance();
        c.set(year, month, day);
        
        String[] strDays = new String[] {"Sunday", "Monday", "Tuesday", "Wednesday", 
            "Thusday", "Friday", "Saturday"};

        // Day_OF_WEEK starts from 1 while array index starts from 0
        return strDays[c.get(Calendar.DAY_OF_WEEK) - 1].toUpperCase();
    }
    
//    public static void main(String[] args) {
//        System.out.println(Result.findDay(6, 19, 2019));
//    }
}

public class Java_Date_and_Time {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        
        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        
        int month = Integer.parseInt(firstMultipleInput[0]);
        
        int day = Integer.parseInt(firstMultipleInput[1]);
        
        int year = Integer.parseInt(firstMultipleInput[2]);
        
        String res = Result.findDay(month, day, year);
        
        bufferedWriter.write(res);
        bufferedWriter.newLine();
        
        bufferedReader.close();
        bufferedWriter.close();
    }
}

//public class Java_Date_and_Time {
//    public static void main(String[] args) {
//        Result.findDay(7, 19, 2019);
//    }
//}