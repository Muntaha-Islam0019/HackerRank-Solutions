import java.io.*;
import java.math.BigInteger;
import java.util.*;

/**
 * Java_BigInteger
 */
public class Java_BigInteger {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        String first, second;

        first = scanner.nextLine();
        second = scanner.nextLine();

        BigInteger bi_one = new BigInteger(first);
        BigInteger bi_two = new BigInteger(second);

        System.out.println(bi_one.add(bi_two));
        System.out.println(bi_one.multiply(bi_two));
    }
}