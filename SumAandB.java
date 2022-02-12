import java.util.Scanner;

public class sumAandB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please write the first number:");
        int numberA = Integer.valueOf(scanner.nextLine());

        System.out.println("Please write the second number:");
        int numberB = Integer.valueOf(scanner.nextLine());

        int sum = numberA+numberB;
        int subtraction = numberB-numberA;
        int multiplication = numberA*numberB;

        if (numberA>numberB){
            System.out.println("The number A is higher than number B, the sum of those two numbers is: "+sum);
        }else if (numberB>numberA){
            System.out.println("The number B is higher than number A, the subtraction of those two numbers is: "+subtraction);
        }else if (numberA==numberB){
            System.out.println("The number A is the same as number B, the multiplication of those two numbers is: "+multiplication);
        }
    }
}


