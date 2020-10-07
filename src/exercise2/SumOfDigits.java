package exercise2;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: "); 
        int number = input.nextInt();
        int a = number % 10;
        int number1= number / 10; 
        int b = number1 % 10;
        int number2 = number1 /10;
        int c = number2 % 10;
        

        System.out.println("Sum of digits: " + (a + b + c) );
    }

}
