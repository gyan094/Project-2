package Guess_The_Number;
import java.util.Scanner;

public class Guess_the_number {
    public static void main(String[] args) {
        //mini project guess the number
        Scanner sc = new Scanner(System.in);
        int mynumber =(int)(Math.random()*100);
        int userNumber = 0;

        do {
            System.out.println("Guess my number : ");
            userNumber = sc.nextInt();

            if (userNumber == mynumber) {
                System.out.println("WOOHOO ..  CORRECT NUMBER");
                break;
            } else if (userNumber > mynumber) {
                System.out.println("your number is too large");
            } else {
                System.out.println("your number is too small");
            }
        }while (userNumber >= 0);
        System.out.println("My number was : ");
        System.out.println("mynumber");
    }
}

