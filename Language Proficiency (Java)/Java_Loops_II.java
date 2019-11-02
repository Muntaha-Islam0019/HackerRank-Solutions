import java.util.*;
import java.io.*;

class Java_Loops_II{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++) {

            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int x = a;
            for(int j = 1; j <= n; j++) {

                for(int k = 0; k < j; k++) {
                    x += (int)Math.pow(2, k) * b;
                }

                System.out.print(x + " ");
                x = a;
            }

            System.out.println();
        }
        in.close();
    }
}

