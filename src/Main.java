import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = "Demi Lovato";
        String accountType = "Corrente";
        double accountBalance = 1599.99;
        int option = 0;

        System.out.println("***********************************\n");
        System.out.println("Nome do cliente: " + name);
        System.out.println("Tipo da conta: " + accountType);
        System.out.println("Saldo atual: " + accountBalance);
        System.out.println("\n***********************************");

        String menu = """
                ** Digite sua opção **
                1 - Check balance
                2 - Transfer value
                3 - Receive value
                4 - Exit
                """;


        while (option != 4) {
            System.out.println(menu);
            option = scan.nextInt();
        }
    }
}