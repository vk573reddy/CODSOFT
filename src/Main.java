public class Main {
    public static void main(String[] args) {
        // Initialize the bank account with a starting balance of $1000
        BankAccount account = new BankAccount(1000.00);
        
        // Create an ATM instance linked to the user's bank account
        ATM atm = new ATM(account);
        
        // Display the ATM menu
        atm.showMenu();
    }
}
