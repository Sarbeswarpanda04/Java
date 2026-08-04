import java.util.Scanner;

public class area_of_circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius : ");
        float radius = sc.nextFloat();

        double area = 3.14 * radius * radius;

        System.out.println("Area of the Circle is : "+area);
    }
}
