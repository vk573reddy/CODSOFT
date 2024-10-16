import java.util.Scanner;

public class ATM {
    private BankAccount account;

    // Constructor that links the ATM to the user's bank account
    public ATM(BankAccount account) {
        this.account = account;
    }

    // Display the ATM menu and handle user input
    public void showMenu() {
        Scanner sc = new Scanner(System.in);
        int option = 0;

        while (option != 4) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            if (sc.hasNextInt()) {
                option = sc.nextInt();

                switch (option) {
                    case 1:
                        checkBalance();
                        break;
                    case 2:
                        System.out.print("Enter deposit amount: ");
                        double depositAmount = sc.nextDouble();
                        deposit(depositAmount);
                        break;
                    case 3:
                        System.out.print("Enter withdrawal amount: ");
                        double withdrawalAmount = sc.nextDouble();
                        withdraw(withdrawalAmount);
                        break;
                    case 4:
                        System.out.println("Thank you for using the ATM. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid option! Please choose again.");
                }
            } else {
                System.out.println("Please enter a valid number!");
                sc.next();  // Clear invalid input
            }
        }

        sc.close();  // Close the scanner
    }

    // Method to display the current balance
    private void checkBalance() {
        System.out.println("Current balance: $" + account.getBalance());
    }

    // Method to deposit money
    private void deposit(double amount) {
        account.deposit(amount);
    }

    // Method to withdraw money
    private void withdraw(double amount) {
        account.withdraw(amount);
    }
}
