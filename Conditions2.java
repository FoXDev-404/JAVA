import java.util.*;

public class Conditions2 {
    public static void main(String[] args) {
        try (// Short Hand If...Else
                Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter age :");
            int age = sc.nextInt();
            /* Short hand if else compleate in one line */
            String result = (age >= 18) ? "You are adult.\nYou can Vote." : "You are not adult.\nYou can not vote.";
            System.out.println(result);
        }
    }
}