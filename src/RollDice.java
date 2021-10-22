
import java.util.Random;

public class RollDice {


    public static void main(String[] args) {

        Random r = new Random();
        int result = r.nextInt(6);
        result++;


        System.out.println("you rolled a " + result);

        if (result == 6) {
            System.out.println("you can Start Game");
        }
    }
}
