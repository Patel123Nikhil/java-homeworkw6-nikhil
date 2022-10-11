package homeworkweek6;
/*Write a Java program to convert a given string into lowercase.
        Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.*/


import java.util.Scanner;

public class HomeWork19 {
    public static void main(String[] args) {
        Scanner build = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String line = build.nextLine();
        line = line.toLowerCase();
        System.out.println(line);


    }
}

