import java.util.*;

public class Qs1 {
    public static void main(String[] args) {
        try (// Take 2 variavles 'a' & 'b' and print their sum.
                Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = a + b;
            System.out.println("Sum is : " + sum);
        }

    }
}
