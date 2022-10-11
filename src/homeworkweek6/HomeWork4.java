package homeworkweek6;
/* Write a Java programme using the following steps.
        4.1 Declare two instance and two static variables.
        4.2 Declare one instance method.
        4.3 Declare one static method.
        4.4 Call all four instance and static variables into both instance and static methods inside the
        print statement.
        4.5 Declare the Main method.
        4.6 Call both instance and static methods into the Main method and run the programme.*/

public class HomeWork4 {
    //4.1 Declare two instance and two static variables.
    int a = 10;
    int b = 20;
    static int c = 30;
    static int d = 40;

    public static void main(String[] args) { //4.5
HomeWork4 borad =  new HomeWork4();
borad.myMobile();
myComputer();
    }

    // 4.2 Declare one instance method.
    public void myMobile() {
        System.out.println(a); //4.4
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);


    }
    //4.3 Declare one static method.
    public static void myComputer() {
        HomeWork4 nikhil = new HomeWork4();
        System.out.println(nikhil.a);
        System.out.println(nikhil.b);
        HomeWork4 tilak = new HomeWork4();
        System.out.println(tilak. c);
        System.out.println(tilak. d);


    }



}

