import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Java_Static_Initializer_Block {

    static int B,H;
    static boolean flag = true;

static {
    
    try {
        Scanner sc = new Scanner(System.in);

        B = sc.nextInt();
        H = sc.nextInt();

        if(B <= 0 || H <= 0) {
            flag = false;
            throw new java.lang.Exception();
        }
    } catch (Exception e) {
        System.out.println(e + ": Breadth and height must be positive");
    }
}

public static void main(String[] args){
  if(flag){
   int area=B*H;
   System.out.print(area);
  }
  
 }//end of main

}//end of class

