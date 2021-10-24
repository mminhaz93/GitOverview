import java.util.Scanner;

public class GradeResult {

    public static void main(String[] args) {


        isGrade();


    }

    public static boolean isValidGrade(int Test) {
        if (Test < 0) {
            return false;
        } else if (Test > 100) {
            return false;
        } else return true;
    }

    public static void isGrade() {
        int Test = 40;

        if (isValidGrade(Test) && Test >= 90 && Test <= 100) {
            System.out.println("You got A ");
        } else if (isValidGrade(Test) && Test >= 80 && Test <= 89) {
            System.out.println("You got B");
        } else if (isValidGrade(Test) && Test >= 65 && Test <= 79) {
            System.out.println("You got C ");
        } else if (isValidGrade(Test) && Test >= 0 && Test <= 64) {
            System.out.println(" You failed ");
        }
    }


}






