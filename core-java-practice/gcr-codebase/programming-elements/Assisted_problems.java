//2. Add Two Numbers
import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;

        System.out.println("Sum = " + sum);

        sc.close();
    }
}
//3. Celsius to Fahrenheit Conversion
import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * 9.0 / 5.0) + 32;

        System.out.println("Temperature in Fahrenheit = " + fahrenheit);

        sc.close();
    }
}
//4. Area of a Circle
import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double area = Math.PI * radius * radius;

        System.out.println("Area of Circle = " + area);

        sc.close();
    }
}
//5. Volume of a Cylinder
import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        double volume = Math.PI * radius * radius * height;

        System.out.println("Volume of Cylinder = " + volume);

        sc.close();
    }
}