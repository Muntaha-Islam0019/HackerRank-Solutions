import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();

        // Write your code here.

        /*Putting this to make sure all the integers are already entered in i.
        * Not putting this won't cause any problem.
        * */
        scan.nextLine();
        double d = scan.nextDouble();

        /*Putting this to make sure all the doubles are already entered in d.
        * Not putting this WILL CAUSE PROBLEMS.
        * Because, if you use the nextLine() method immediately following the nextInt() method,
        * recall that nextInt() reads integer tokens; because of this, the last newline character
        * for that line of integer input is still queued in the input buffer and the next nextLine()
        * will be reading the remainder of the integer line (which is empty).
        * */
        scan.nextLine();
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}