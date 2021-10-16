public class BasicOperators {

    /*
    Java provides a rich set of operators to manipulate variables.
    We can divide all the Java operators into the following groups −

Arithmetic Operators
Relational Operators
Bitwise Operators
Logical Operators
Assignment Operators
Misc Operators
     */

    //arithmetic
    public static void main(String args[]) {
        int a = 3;
        int b = 2;
        int c = 5;
        int d = 6;

        System.out.println("a + b = " + (a + b) );
        System.out.println("a - b = " + (a - b) );
        System.out.println("a * b = " + (a * b) );
        System.out.println("b / a = " + (b / a) );
        System.out.println("b % a = " + (b % a) );
        System.out.println("c % a = " + (c % a) );
        System.out.println("a++   = " +  (a++) );
        System.out.println("a-- = " + (a--) );

        // Check the difference in d++ and ++d
        System.out.println("d++   = " +  (d++) );
        System.out.println("++d   = " +  (++d) );
    }
}
