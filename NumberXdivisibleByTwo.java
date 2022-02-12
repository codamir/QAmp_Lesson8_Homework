import java.util.Scanner;

public class numberXdivisibleByTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please write some number:");
        int number = Integer.valueOf(scanner.nextLine());

        int numberFinal = (((number*number)+6)/2)-number;

        System.out.println("The final number is: " +numberFinal);

        if (numberFinal%2 != 0) {
            System.out.println("Sorry the final number is not divisible by two.");
        }else System.out.println("Great, the final number is divisible by two.");
    }
}
