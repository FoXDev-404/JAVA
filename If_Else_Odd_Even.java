import java.util.*;

public class If_Else_Odd_Even {
    public static void main(String[] args) {

        // Odd Evan in java using If...Else
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int x = sc.nextInt();

        if (x % 2 == 0) {
            System.out.println(x + " is even");
        } else {
            System.out.println(x + " is odd");
        }
    }
}
