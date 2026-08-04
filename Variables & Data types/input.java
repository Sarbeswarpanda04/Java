import java.util.Scanner;
// import java.util.*;    -- it import all packages
public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name : ");
        String name = sc.nextLine();
        System.out.print("Enter age : ");
        int age = sc.nextInt();

        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }
}
