import java.util.Scanner;
// import java.util.*;    -- it import all packages
public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Name : ");
        String input = sc.nextLine();
        System.out.println(input);
    }
}
