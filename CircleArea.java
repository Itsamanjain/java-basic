import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius, area;

        System.out.print("Enter the radius of the circle: ");
        radius = input.nextDouble();

        // Calculate the area of the circle using the formula A = πr^2
        area = Math.PI * radius * radius;

        System.out.println("The area of the circle is: " + area);
    }
}
