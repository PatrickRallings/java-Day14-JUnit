import java.util.Scanner;

public class MultiplicationTables {
    public static void main(String[] args) {
        System.out.println("Please input a number");
        double inputNum = MultiplicationTables.scanner();
        MultiplicationTables.loop(inputNum);
    }
    public static void loop(double inputNum) {
        System.out.println("User input the number "+inputNum);
        for (int i = 1; i <= 10; i++) {
            System.out.println(inputNum+" * "+i+" = "+(inputNum * i));
        }
    }
    public static double scanner() {
        Scanner scan = new Scanner(System.in);
        return scan.nextDouble();
    }
}
