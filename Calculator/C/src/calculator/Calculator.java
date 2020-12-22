package calculator;

// Baha Serdaroglu

import java.io.IOException;
import java.util.Scanner;

public class Calculator {

    public static void main(String args[]) throws IOException {
        String commend = new String();
        String opeator = new String();
        int result = 0;

        while (true) {

            Scanner input = new Scanner(System.in);
            System.out.print("if you want to quit press \"q\" if not press c: ");
            commend = input.nextLine();
            if (commend.equals("q") || commend.equals("Q")) {
                System.exit(0);

            } else if (commend.equals("c") || commend.equals("C")) {
                System.out.print("Enter your first number: ");
                int x = input.nextInt();
                System.out.print("Enter your second number: ");
                int y = input.nextInt();
                System.out.print("Enter your oparetor: ");
                opeator = input.next();
                switch (opeator) {
                    case "+":
                        result = x + y;
                        break;
                    case "-":
                        result = x - y;
                        break;
                    case "*":
                        result = x * y;
                        break;
                    case "/":
                        result = x / y;
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + opeator);

                }
            }


            System.out.println("Your result is : " + result);
        }


    }


}

