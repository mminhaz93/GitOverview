import java.util.Random;

public class TwoDice {


    public static void main(String[] args) {

        Random r = new Random();
        int result = r.nextInt(6);
        result++;

        Random b = new Random();
        int result2 = b.nextInt(6);
        result++;

        System.out.println("dice " + result);
        System.out.println("dice2 " + result2);

        if (result == result2) {
            System.out.println("Guess What You Got A Match");
        }


    }
}