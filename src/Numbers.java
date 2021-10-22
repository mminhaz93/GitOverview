public class Numbers {
    public static void main(String[] args) {

       // Random
        int min = 5;
        int max = 10;

        System.out.println("Random value of type int between "+min+" to "+max+ ":");
            int getRandomValue = (int) (Math.random() * (max - min+1)) + min;
            System.out.println(getRandomValue);

     // swapping example
        int o = 30;
        int p = 45;
        System.out.println("Before swapping, o = " + o + " and p = " + p);

        // Invoke the swap method
        swapFunction(o, p);
        System.out.println("\n**Now, Before and After swapping values will be same here**:");
        System.out.println("After swapping, o = " + o + " and p is " + p);
    }

    public static void swapFunction(int o, int p) {
        System.out.println("Before swapping(Inside), o = " + o + " p = " + p);

        // Swap n1 with n2
        int m = o;
        o = p;
        p = m;
        System.out.println("After swapping(Inside), o = " + o + " p = " + p);





//Example mini Number
        int a = 11;
        int b = 6;
        double c = 7.3;
        double d = 9.4;
        int result1 = minFunction(a, b);


        double result2 = minFunction(c, d);
        System.out.println("Minimum Value = " + result1);
        System.out.println("Minimum Value = " + result2);
    }

     //minfunation
    public static int minFunction(int n1, int n2) {
        int min;
        if (n1 > n2)
            min = n2;
        else
            min = n1;

        return min;
    }


    public static double minFunction(double n1, double n2) {
        double min;
        if (n1 > n2)
            min = n2;
        else
            min = n1;

        return min;



    }
    }


