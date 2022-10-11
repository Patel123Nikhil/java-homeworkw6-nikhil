package homeworkweek6;
/* Write a Java programme using the following steps.
        3.1 Declare one instance and one static variable.
        3.2 Declare one instance method.
        3.3 Declare one static method.
        3.4 Call both instance and static variables into both instance and static methods inside the
        print statement.
        3.5 Declare the Main method.
        3.6 Call both instance and static methods into the Main method and run the programme*/

public class HomeWork3 {
      //3.1 Declare one instance and one static variable.
    int a = 10;
    static int b =20;

    public static void main(String[] args) {  //3.5
    HomeWork3 homeWork1 = new HomeWork3();
        homeWork1.frame();
        photoFrame();
    }
   // 3.2 Declare one instance method.
    public void frame(){
        System.out.println(a); //3.4
        System.out.println(b);//3.4
}
// 3.3 Declare one static method.
    public static void photoFrame(){
        HomeWork3 obj = new HomeWork3();
        System.out.println(obj.a); //3.4
        System.out.println(b);   //3.4

    }








}
