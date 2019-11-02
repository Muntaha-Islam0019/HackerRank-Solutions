import java.util.Scanner;

public class Java_Output_Formatting {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                
                int backUpX = x;

                int digitCount = 0;
                while(x != 0) {
                    x /= 10;
                    digitCount++;
                }

                char[] cArr =  new char[15];
                for(int index = 0; index < 15; index++) {

                    if(index < s1.length()) {
                        cArr[index] = s1.charAt(index);
                    } else {
                        cArr[index] = ' ';
                    }
                }

                for(char c : cArr) System.out.print(c);
                switch(digitCount) {

                    case 0:
                    System.out.print("000");
                    break;

                    case 1:
                    System.out.print("00" + backUpX);
                    break;

                    case 2:
                    System.out.print("0" + backUpX);
                    break;

                    case 3:
                    System.out.print(backUpX);
                    break;

                    default:
                    break;
                }

                System.out.println();
            }
            System.out.println("================================");

    }
}