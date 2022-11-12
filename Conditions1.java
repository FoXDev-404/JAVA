import java.util.*;

public class Conditions1 {
    public static void main(String[] args) {
        try (// This is an example of conditional statement if-else, else if & input.
                Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter x :");
            int x = sc.nextInt();
            System.out.print("Enter y :");
            int y = sc.nextInt();
            if (x > y) {
                System.out.println("X > Y " + x + ">" + y);
            } else if (x == y) {
                System.out.println("X = Y " + x + "=" + y);
            } else {
                System.out.println("X < Y " + x + "<" + y);
            }
        }
    }
}
