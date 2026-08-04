import java.util.Scanner;
public class sum_of_a_b {
    public static void main(String[] args) {
        // int a = 5;
        // int b = 10;
        // int sum = a + b;
        // System.out.println("Sum of " + a + " and " + b + " is: " + sum);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter 1st number : ");
        int num2 = sc.nextInt();

        int sum = num1+num2;

        System.out.print("Sum of "+num1+" and "+num2+" = "+sum);
    }
}
