public class Random {

    public static void main(String args[]) {

        Integer c = 5;
        Integer r = 10;
        Integer l = 5;
        Short m = 5;
        System.out.println(c.equals(r));
        System.out.println(c.equals(l));

//MinNumber
        int a = 11;
        int b = 6;
        int d = minFunction(a, b);
        System.out.println("Minimum Value = " + d);
    }

    /**
     * returns the minimum of two numbers
     */
    public static int minFunction(int n1, int n2) {
        int min;
        if (n1 > n2)
            min = n2;
        else
            min = n1;

        return min;












        }


    }

