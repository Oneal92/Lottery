/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lotteryconsole;

/**
 *
 * @author bapti
 */    
import java.util.Random;
import java.util.Scanner;



public class LotteryConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = -1, num2 = -1, num3 = -1;

        // Input loop to ensure valid numbers are entered
        while (true) {
            System.out.print("Enter your first number (0-99): ");
            if (scanner.hasNextInt()) {
                num1 = scanner.nextInt();
                if (num1 >= 0 && num1 < 100) break;
            }
            scanner.nextLine(); // Clear invalid input
            System.out.println("Invalid input. Please enter an integer between 0 and 99.");
        }

        while (true) {
            System.out.print("Enter your second number (0-99): ");
            if (scanner.hasNextInt()) {
                num2 = scanner.nextInt();
                if (num2 >= 0 && num2 < 100) break;
            }
            scanner.nextLine(); // Clear invalid input
            System.out.println("Invalid input. Please enter an integer between 0 and 99.");
        }

        while (true) {
            System.out.print("Enter your third number (0-99): ");
            if (scanner.hasNextInt()) {
                num3 = scanner.nextInt();
                if (num3 >= 0 && num3 < 100) break;
            }
            scanner.nextLine(); // Clear invalid input
            System.out.println("Invalid input. Please enter an integer between 0 and 99.");
        }

        System.out.println("Your numbers are: " + num1 + ", " + num2 + ", " + num3);

        // Lottery simulation loop
        Random rand = new Random();
        int iterations = 0;

        while (true) {
            iterations++;
            int lotteryNum1 = rand.nextInt(100);
            int lotteryNum2 = rand.nextInt(100);
            int lotteryNum3 = rand.nextInt(100);

            if (lotteryNum1 == num1 && lotteryNum2 == num2 && lotteryNum3 == num3) {
                System.out.println("Your numbers have been selected!");
                System.out.println("It took " + iterations + " iterations to match your numbers.");
                break;
            }
        }
    }
}


