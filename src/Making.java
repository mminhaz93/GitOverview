public class Making {
    public static void main(String[] args) {

        // Random
        int min = 1;
        int max = 6;


        int getRandomValue = (int) (Math.random() * (max - min + 1)) + min;
        System.out.println("you rolled a " + getRandomValue);

        if (getRandomValue == 6) {
            System.out.println("you can Start Game");

        }
    }
}
