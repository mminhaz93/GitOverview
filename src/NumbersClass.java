public class NumbersClass {


    public static void main(String args[]) {
        //Example of boxing and unboxing
        /*When x is assigned integer values, the compiler boxes the integer because x is integer objects. Later, x is
        unboxed so that they can be added as integers. */
        Integer x = 5; // boxes int to an Integer object
        x = x + 30;   // unboxes the Integer to an int
        System.out.println(x);

        /*
        xxxValue() Method
        separate method for each primitive data type
        byte byteValue()
        short    shortValue()
        int intValue()
        long longValue()
        float floatValue()
        double doubleValue()
        Converts the value of this Number object to the xxx data type and returns it
         */

        Integer p = 3;

        // Returns byte primitive data type
        System.out.println(p.byteValue());

        // Returns double primitive data type
        System.out.println(p.doubleValue());

        // Returns long primitive data type
        System.out.println(p.longValue());

            /*Compares this Number object to the argument.
            compareTo()
            if the integer is equal to the argument then 0 is returned
            if the integer is less than the argument then -1 is returned
            if the integer is greater than the argument then 1 is returned
             */

            Integer s = 1;
            System.out.println(s.compareTo(1));
            System.out.println(s.compareTo(3));
            System.out.println(s.compareTo(2));

            // equals ()
        Integer m = 5;
        Integer y = 10;
        Integer z =5;
        Short a = 5;
        System.out.println(m.equals(y));
        System.out.println(m.equals(z));
        System.out.println(m.equals(a));

        //round() returns the closest long or int,
        // as indicated by the method's return type, to the argument.
        double d = 100.375;
        double e = 100.670;
        float f = 100;
        float g = 90f;
        System.out.println(Math.round(d));
        System.out.println(Math.round(e));
        System.out.println(Math.round(f));
        System.out.println(Math.round(g));
    }
    }
