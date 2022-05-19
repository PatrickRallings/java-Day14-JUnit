import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Enter a number:");
            double inputNum = PositiveNumbers.scanner();
            if (inputNum == 0) {
                break;
            } else if (inputNum > 0) {
                System.out.println("Number is "+inputNum);
                continue;
            } else {
                System.out.println("Must be a positive number.");
            }
        }
    }
    public static double scanner() {
        Scanner scan = new Scanner(System.in);
        return scan.nextDouble();
    }
}
