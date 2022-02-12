import java.util.Scanner;

public class Povrsina_kruga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a radius in cm: ");

        int radius = Integer.valueOf(scanner.nextLine());
        double piNumber = 3.14159265359;
        double circleArea = radius*radius*piNumber;

        System.out.println("The area of a circle is: "+circleArea + " cm2");


//
//        double radius = 6;
//
        //

        }
    }



