import java.util.Scanner;

public class CountToEleven {
    public static void main(String[] args) {
        System.out.println("Enter a number less than 11");
        double inputNum = CountToEleven.scanner();
        CountToEleven.loop(inputNum);
    }
    public static double scanner() {
        Scanner scan = new Scanner(System.in);
        return scan.nextDouble();
    }
    public static String loop(double inputNum) {
        String nums = "";
        for (double i = inputNum; i <= 11; i++)
            nums += String.valueOf(i)+"\n";
        return nums;
    }
}
