import java.util.Scanner;

public class logicABCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write first number:");
        int numberA = Integer.valueOf(scanner.nextLine());

        System.out.println("Write second number:");
        int numberB = Integer.valueOf(scanner.nextLine());

        System.out.println("Write third number:");
        int numberC = Integer.valueOf(scanner.nextLine());

        System.out.println("Write fourth number:");
        int numberD = Integer.valueOf(scanner.nextLine());

        int sum = numberA+numberB+numberC+numberD;
        int sumDivision = sum/2;
        int sumMinus = sum-1;
        int sumMinusDivision = sumMinus/2;

        if (sum%2==0 && ((numberA>0 && numberB>0) || (numberC>0 && numberD>0))){
            System.out.println("The sum of entered four numbers is: "+sum);
            System.out.println("The sum is divisible by two, and the result is: " + sumDivision);
        }else if (sumMinus%2 == 0){
            System.out.println("After correction the sum is divisible by two, and the result is: "+sumMinusDivision);
        }else System.out.println("The sum is not divisible by two");
        }
    }
