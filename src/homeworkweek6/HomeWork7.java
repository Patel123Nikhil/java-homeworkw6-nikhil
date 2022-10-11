package homeworkweek6;
/* Write a program to insert any temperature value in degree Fahrenheit and
        convert to degree Celsius ((F − 32) × 5/9 = 0°C)*/


import java.util.Scanner;

public class HomeWork7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a degree in Fahrenheit : ");
        double fahrenheit = input.nextDouble();

        double celsius = ((5 * (fahrenheit - 32)) / 9.0);
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celcius");


    }


}











