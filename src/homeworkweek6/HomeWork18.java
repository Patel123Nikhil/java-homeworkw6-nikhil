package homeworkweek6;

/*Write a Java program to print the sum (addition), multiply, subtract, divide and
        remainder of two numbers.
        Test Data:
        Input first number: 125
        Input second number: 24*/


import java.util.Scanner;

public class HomeWork18 {
    public static void main(String[] args) {
        Scanner nb = new Scanner(System.in);

        System.out.print("Input first number: ");
        int num1 = nb.nextInt();

        System.out.print("Input second number: ");
        int num2 = nb.nextInt();


        System.out.println(num1 + " + " + num2 + " = " +
                (num1 + num2));

        System.out.println(num1 + " - " + num2 + " = " +
                (num1 - num2));

        System.out.println(num1 + " x " + num2 + " = " +
                (num1 * num2));

        System.out.println(num1 + " / " + num2 + " = " +
                (num1 / num2));

        System.out.println(num1 + " mod " + num2 + " = " +
                (num1 % num2));
    }
    }


