import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = "Demi Lovato";
        String accountType = "Checking";
        double accountBalance = 1599.99;
        int option = 0;

        System.out.println("***********************************\n");
        System.out.println("Client name: " + name);
        System.out.println("Account type: " + accountType);
        System.out.println("Current balance: " + accountBalance);
        System.out.println("\n***********************************");

        String menu = """
                ** Type your option **
                1 - Check balance
                2 - Transfer value
                3 - Receive value
                4 - Exit
                """;


        while (option != 4) {
            System.out.println(menu);
            option = scan.nextInt();

            if (option == 1) {
                System.out.println("Your current balance is $" + accountBalance);
            }
            else if (option == 2) {
                System.out.println("What amount do you want to transfer?");
                double amount = scan.nextDouble();

                if (amount > accountBalance) {
                    System.out.println("Insufficient balance to make the transfer!");
                } else {
                    accountBalance -= amount;
                    System.out.println("New balance: $" + accountBalance);
                }
            }
            else if (option == 3) {
                System.out.println("Amount received: ");
                double amount = scan.nextDouble();
                accountBalance += amount;
                System.out.println("New balance: $" + accountBalance);
            }
            else if (option != 4) {
                System.out.println("Invalid option!");
            }
        }
    }
}