import com.sun.source.tree.IfTree;

import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class Lesson_8_Homework {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How much money do you have?");
        int money = Integer.valueOf(scanner.nextLine());

        if (money>100){
            System.out.println("You have too much money!");
        } else if (money == 0){
            System.out.println("Well, we can't do business then.");
        }else
            System.out.println("Please write down the value of your receipt?");

        int receipt = Integer.valueOf(scanner.nextLine());

        if (receipt>money){
            System.out.println("Sorry, you don't have enough money!");
        }else if (receipt==0) {
            System.out.println("You didn't buy anything did you?");
        }else if (receipt<0){
            System.out.println("Did you maybe break something?");
        }else if(money>receipt){

        int difference = money-receipt;

        int twentyBillCount = difference/20;
        int differenceTwo = difference-(twentyBillCount*20);

        int tenBillCount = differenceTwo/10;
        int differenceThree = differenceTwo-(tenBillCount*10);

        int twoCoinCount = differenceThree/2;
        int differenceFour = differenceThree-(twoCoinCount*2);

        int oneCoinCount = differenceFour/1;
        int differenceFive = differenceFour-(oneCoinCount*1);

        if ((money<=100) && (receipt>0)) {
            System.out.println("-------------------------------");
            System.out.println("You have paid: " + money + " BAM");
            System.out.println("Your receipt is: " + receipt + " BAM");

            System.out.println("-------------------------------");
            System.out.println("Your change is: " + difference + " BAM");
            System.out.println("-------------------------------");

            System.out.println("YOUR CHANGE WILL BE PAID AS FOLLOWS:");
            System.out.println("Number of banknotes in the amount of 20 BAM: " + twentyBillCount);
            System.out.println("Number of banknotes in the amount of 10 BAM: " + tenBillCount);
            System.out.println("Number of coins in the amount of 2 BAM: " + twoCoinCount);
            System.out.println("Number of coins in the amount of 1 BAM: " + oneCoinCount);
            System.out.println("-------------------------------");
        }
        }
    }
}