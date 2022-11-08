import java.util.*;

public class Conditions3 {
    public static void main(String[] args) {
        // Taking 2 numbers from user & checking if a=b, a>b & a<b
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        if (a == b) {
            System.out.println("Equal");
        } else if (a > b) {
            System.out.println(a + " is greater than " + b);
        } else {
            System.out.println(a + " is less then " + b);
        }
    }
}