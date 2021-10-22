public class Grade {
    public static void main(String args[]) {

        char grade = 'C';

        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
            case 'C':
                System.out.println("Well done");
                break;
            case 'D':
                System.out.println("You passed");
            case 'F':
                System.out.println("Better try again");
                break;
            default:
                System.out.println("Invalid grade");
        }
        System.out.println("Your grade is " + grade);


        int b = 30;
        int c = 10;

        if (b == 30) {
            if (c == 10) {
                System.out.print("B = 30 and C = 10");
            }
        }
    }
}

