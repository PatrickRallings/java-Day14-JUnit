import java.util.Scanner;

public class StopAtFive {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Give a number:");
            double inputNum = StopAtFive.scanner();
            if (inputNum == 5) {
                break;
            }
        }
    }
    public static double scanner() {
        Scanner scan = new Scanner(System.in);
        return scan.nextDouble();
    }
}
