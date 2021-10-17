public class Main {

    public static void main(String args[]) {

        // xxxValue
        Integer y = 5;

        // Returns byte primitive data type
        System.out.println(y.byteValue());

        // Returns double primitive data type
        System.out.println(y.doubleValue());

        // Returns long primitive data type
        System.out.println(y.longValue());

        // CompareTo
        Integer t = 5;

        System.out.println(t.compareTo(3));
        System.out.println(t.compareTo(5));
        System.out.println(t.compareTo(8));

        // equals
        Integer c = 5;
        Integer r = 10;
        Integer l = 5;
        Short m = 5;
        System.out.println(c.equals(r));
        System.out.println(c.equals(l));
        System.out.println(c.equals(m));
        //Value
        Integer x = Integer.valueOf(9);
        Double f = Double.valueOf(5);
        Float a = Float.valueOf("80");
        Integer b = Integer.valueOf("444", 16);
        // toString
        Integer p = 5;

        System.out.println(p.toString());
        System.out.println(Integer.toString(12));

        System.out.println(x);
        System.out.println(f);
        System.out.println(a);
        System.out.println(b);
        // parseInt
        int v = Integer.parseInt("9");
        double i = Double.parseDouble("5");
        int o = Integer.parseInt("444", 16);

        System.out.println(v);
        System.out.println(i);
        System.out.println(o);
        // abs
        Integer q = -8;
        double w = -100;
        float s = -90;

        double d = -100.675;
        float g = -90;
        System.out.println(Math.abs(q));
        System.out.println(Math.abs(w));
        System.out.println(Math.abs(s));
        // ceil and floor
        System.out.println(Math.ceil(d));
        System.out.println(Math.ceil(g));

        System.out.println(Math.floor(d));
        System.out.println(Math.floor(g));
        // rint
        double da = 100.675;
        double ea = 100.500;
        double fa = 100.200;
        System.out.println(Math.rint(da));
        System.out.println(Math.rint(ea));
        System.out.println(Math.rint(fa));

        // Round
        double de = 100.675;
        double ee = 100.500;
        float fe = 100;
        float ge = 90f;
        System.out.println(Math.round(de));
        System.out.println(Math.round(ee));

        System.out.println(Math.round(fe));
        System.out.println(Math.round(ge));

        //min
        System.out.println(Math.min(12.123, 12.456));
        System.out.println(Math.min(23.12, 23.0));

        //max
        System.out.println(Math.max(12.123, 12.456));
        System.out.println(Math.max(23.12, 23.0));

         // random
        System.out.println(Math.random());
        System.out.println(Math.random());
        // isLetter
        System.out.println(Character.isLetter('c'));
        System.out.println(Character.isLetter('5'));
        // isDigit
        System.out.println(Character.isDigit('c'));
        System.out.println(Character.isDigit('5'));
        // isWhitespace
        System.out.println(Character.isWhitespace('c'));
        System.out.println(Character.isWhitespace(' '));
        System.out.println(Character.isWhitespace('\n'));
        System.out.println(Character.isWhitespace('\t'));
         //isUpperCase
        System.out.println(Character.isUpperCase('c'));
        System.out.println(Character.isUpperCase('C'));
        System.out.println(Character.isUpperCase('\n'));
        System.out.println(Character.isUpperCase('\t'));
        //isLowerCase
        System.out.println(Character.isLowerCase('c'));
        System.out.println(Character.isLowerCase('C'));
        System.out.println(Character.isLowerCase('\n'));
        System.out.println(Character.isLowerCase('\t'));
        //toUpperCase
        System.out.println(Character.toUpperCase('c'));
        System.out.println(Character.toUpperCase('C'));
        //toLowerCase
        System.out.println(Character.toLowerCase('c'));
        System.out.println(Character.toLowerCase('C'));
        //toString
        System.out.println(Character.toString('c'));
        System.out.println(Character.toString('C'));
       // StringCompareto
        String str1 = "Strings are immutable";
        String str2 = new String("Strings are immutable");
        String str3 = new String("Integers are not immutable");

        int result = str1.compareTo( str2 );
        System.out.println(result);

        result = str2.compareTo( str3 );
        System.out.println(result);
        // StringLength
        String Str1 = new String("Welcome to Tutorialspoint.com");
        String Str2 = new String("Tutorials" );

        System.out.print("String Length :" );
        System.out.println(Str1.length());

        System.out.print("String Length :" );
        System.out.println(Str2.length());
        // String to String
        String Str = new String("Welcome to Tutorialspoint.com");

        System.out.print("Return Value :");
        System.out.println(Str.toString());
        //StringIndex

        System.out.print("Found Index :" );
        System.out.println(Str.indexOf( 'o' ));
        //StringStartsWith


        System.out.print("Return Value :" );
        System.out.println(Str.startsWith("Welcome") );

        System.out.print("Return Value :" );
        System.out.println(Str.startsWith("Tutorials") );
        // stringtoLowerCase


        System.out.print("Return Value :");
        System.out.println(Str.toLowerCase());




    }
}