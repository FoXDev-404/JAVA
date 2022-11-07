import java.util.*;

public class Conditions {
    // This is an example of conditional statement. "if else"
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("You are adult.\nYou acn vote.");
        } else {
            System.out.println("You are't adult.\nYou can't vote.");
        }

    }
}
