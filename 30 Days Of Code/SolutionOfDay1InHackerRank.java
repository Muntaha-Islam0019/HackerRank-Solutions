        /* Declare second integer, double, and String variables. */

int integerValue ; 
double floatingValue ;
String stringValue ;

        /* Read and save an integer, double, and String to your variables.*/

integerValue = scan.nextInt () ;
floatingValue = scan.nextDouble () ;
scan.nextLine () ;
stringValue = scan.nextLine () ;

        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        
        /* Print the sum of both integer variables on a new line. */

int sumInt = i + integerValue ;
System.out.println ("" + sumInt ) ;

        /* Print the sum of the double variables on a new line. */

double sumDou = floatingValue + d ;
System.out.println ("" + sumDou ) ;

        /* Concatenate and print the String variables on a new line;
        the 's' variable above should be printed first. */

System.out.println ( s + "" + stringValue ) ;
