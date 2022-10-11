package homeworkweek6;
// Write a program to calculate the area of a triangle.

import java.util.Scanner;

public class HomeWork8 {

    public static void main(String[] args) {
        int a, b, c;
        double area;
        Scanner triangle = new Scanner(System.in);

        System.out.println("Enter value of angle a " );
        a = triangle.nextInt();
        System.out.println("Enter value of angle b " );
        b = triangle.nextInt();
        System.out.println("Enter value of angle c " );
        c = triangle.nextInt();

        area = (a + b + c) /2;
        System.out.println(" Area of triangle is " + area);




    }










}
