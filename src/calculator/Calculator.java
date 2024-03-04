package calculator;

import java.util.Arrays;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[] results = new int[10];
        int[]newArray = new int[0];
        int i;

        for (i = 0; i < results.length; i++) {
            if(i == 0) {
                System.out.println("If you want to exit please enter 'exit', if you want to continue press the enter 'S'.");
            } else {
                System.out.println("If you want to exit please enter 'exit', if you want to continue press the enter 'c'.");
            }
            String s = reader.next();
            if (s.equals("exit") || s.equals("Exit")) {
                newArray = Arrays.copyOf(results, i);
                break;
            }

            System.out.println("Enter 2 numbers: ");

            double first = reader.nextDouble();
            double second = reader.nextDouble();


            System.out.print("Enter the operator: (+, -, *, /): ");

            char operator = reader.next().charAt(0);

            double result = 0.0;

            switch (operator) {
                case '+':
                    result = first + second;
                    break;

                case '-':
                    result = first - second;
                    break;

                case '*':
                    result = first * second;
                    break;

                case '/':
                    result = first / second;
                    break;

                default:
                    System.out.print("Enter the correct operator");
                    return;

            }

            results[i] = (int) result;

            System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result);
            System.out.println();
        }

        System.out.println(Arrays.toString(newArray));
    }
}

/*
 *     HW
 *     1. add an array to save the measurement results with dimension 10
 *     if results will be more, we end the work, informing a user and print the result
 *
 *     2. Enter the code in a loop for opportunity using without  constant program's start.
 *     To exit let be the word "exit"
 *     I.e. a user enters the exit - we just exit, saving a result in an array of results and output the array to the console.
 */
