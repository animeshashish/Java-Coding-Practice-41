import java.util.Scanner;

public class Rectangle extends Shape{
    public void calculateArea() {
        int length;
        int width;
        int area;

        Scanner sc = new Scanner(System.in);
        System.out.println("Entre length of the Rectangle");
        length= sc.nextInt();

        System.out.println("Entre the width of the Rectangle");
        width= sc.nextInt();

        area= length * width;
        System.out.println("Area of the Rectangle is:" + area);


    }
}
