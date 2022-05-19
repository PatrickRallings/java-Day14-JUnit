import java.util.Scanner;
public class TakeABreak {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Do you want to take a break?");
            String inputString = TakeABreak.scanner();
            if (inputString.equalsIgnoreCase("YES"))
                break;
        }
    }
    public static String scanner() {
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }
}