import java.util.Scanner;
public class ScannerClass {
    // Scanner Class in Java is found in java.util package and it provides us with methods to read input from user.

    public static void main(String[] args) {
        // Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("What Is Your Name: ");
        String userName = sc.nextLine();
        System.out.println("Hello " + userName);
        
    }
}
