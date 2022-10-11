package homeworkweek6;
//Write a Java program to print the area and perimeter of a rectangle.


public class HomeWork14 {

    public static void main(String[] args) {

        final double width = 4.6;
        final double height = 7.5;

        double perimeter = 2*(height + width);
        double area = width * height;

        System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f \n", height, width, perimeter);

        System.out.printf("Area is %.1f * %.1f = %.2f \n", width, height, area);







    }








}
