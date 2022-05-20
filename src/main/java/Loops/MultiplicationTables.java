package Loops;

import java.util.Scanner;

public class MultiplicationTables {
    public static void main(String[] args) {
        System.out.println("Please input a number");
        double inputNum = MultiplicationTables.scanner();
        MultiplicationTables.loop(inputNum);
    }
    public static String loop(double inputNum) {
        String nums = "";
        System.out.println("User input the number "+inputNum);
        for (int i = 1; i <= 10; i++) {
            nums += (inputNum * i)+"\n";
        }
        return nums;
    }
    public static double scanner() {
        Scanner scan = new Scanner(System.in);
        return scan.nextDouble();
    }
}
