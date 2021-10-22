public class DoubleDice {
    public static void main(String[] args) {


        int min = 1;
        int max = 6;

        int DiceOne = (int) (Math.random() * (max - min + 1)) + min;
        System.out.println("you rolled a " + DiceOne);
        int DiceTwo = (int) (Math.random() * (max - min + 1)) + min;
        System.out.println("You roll a " + DiceTwo);

        if (DiceOne == DiceTwo) {
            System.out.println("Nice Job you got a match");
        }
    }
}
