package javabasicprogram;

import java.util.Scanner;

public class PrimeNumberProgram2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = scanner.nextInt();

        if(number<=1) {
            System.out.println("Please enter valid number");
        } else {
            boolean flag = true;
            for(int i = 2; i <= number/2; i++) {
                if(number%i == 0) {
                    System.out.println("Number is not a prime number");
                    flag = false;
                    break;
                }
            }
            if(flag) {
                System.out.println("Number is a prime number");
            }
        }
    }
}

