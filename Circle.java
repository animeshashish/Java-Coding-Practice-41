import java.util.Scanner;

public class Circle extends Shape{
    public void calculateArea() {

        int radius;
        double area;

        Scanner sc = new Scanner(System.in);
        System.out.println("Entre the radius of the circle: ");
        radius = sc.nextInt();

        area = (radius*radius)*Math.PI;
        System.out.println("Area of Circle is:" + area);

    }

}
