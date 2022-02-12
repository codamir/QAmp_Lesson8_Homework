import java.util.Scanner;

public class Divisibility {
            public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                System.out.println("Write the first number: ");

                int numberA = Integer.valueOf(scanner.nextLine());
                int divisibilityByThree = numberA%3;

                if (divisibilityByThree != 0){
                    System.out.println("The number you have entered is wrong. It needs to be divisible by three!");
                }else if (numberA<10) {
                    System.out.println("You entered the number lower than 10.");
                }else if (numberA>10000) {
                        System.out.println("You have entered the number higher than 10000");
                }else
                System.out.println("Write the second number, number B: ");
                int numberB = Integer.valueOf(scanner.nextLine());

                    int divisibility = numberA%numberB;


                    if (divisibility == 0) {
                        System.out.println("The number A is divisible by the number B!");
                    }else System.out.println("The number A is not divisible by the number B!");

                }
            }


