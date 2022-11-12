import java.util.*;

public class testfile {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter account number");
            int account_num = sc.nextInt();
            System.out.println("Enter account holder's name");
            String name = sc.nextLine();
            System.out.println("Enter the amount to deposit");
            double amount = sc.nextInt();
            System.out.print("Account number: " + account_num);
            System.out.print("Name: " + name);
            System.out.print("Amount: " + amount);
        }
    }
}