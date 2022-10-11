package homeworkweek6;
/* Writa program for a calculator with addition, subtraction, multiplication
        and de ivision methods all with parameters and use string concatenation
        methods.Note: Two static and Two instance methods.*/


import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {

        int first, second, add, substract, multiply;
        float devide;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Two Numbers : ");
        first = scanner.nextInt();
        second = scanner.nextInt();

        add = first + second;
        substract = first - second;
        multiply = first * second;
        devide = (float) first / second;

        System.out.println("Sum = " + add);
        System.out.println("Diffrence =" + substract);
        System.out.println("Multification = " + multiply);
        System.out.println("Division = " + devide);

    }

    public void addition(int a, int b) {
        System.out.println("Addition of two number is : " + (a + b));

    }

    public void subtraction(int a, int b) {
        int x = a - b;
        System.out.println("Subtraction : + x");
    }

    public static void multiplication(int a, int b) {
        int i = +b;
        System.out.println("multiplication : " + i);
    }

    public static void division(int a, int b) {
        int z = a / b;
        System.out.println("divion : " + z);
    }
}
