import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 1000.00;

        System.out.println("==========================================");
        System.out.println("          WELCOME TO JAVA ATM");
        System.out.println("==========================================");

        while (true) {

            System.out.println("\n-------------- MAIN MENU ----------------");
            System.out.println("  1. Deposit Money");
            System.out.println("  2. Withdraw Money");
            System.out.println("  3. Check Balance");
            System.out.println("  4. Exit");
            System.out.println("------------------------------------------");
            System.out.print("Enter your choice (1-4): ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\n----------- DEPOSIT MONEY ---------------");
                    System.out.print("Enter amount to deposit: ");

                    double depositAmount = sc.nextDouble();

                    if (depositAmount <= 0) {
                        System.out.println("Invalid amount! Deposit must be greater than 0.");
                    } else {
                        balance += depositAmount;

                        System.out.println("Deposit successful!");
                        System.out.printf("New balance: %.2f%n", balance);
                    }
                    break;

                case 2:
                    System.out.println("\n----------- WITHDRAW MONEY --------------");
                    System.out.print("Enter amount to withdraw: ");

                    double withdrawAmount = sc.nextDouble();

                    if (withdrawAmount <= 0) {
                        System.out.println("Invalid amount! Enter a valid amount.");
                    } else if (withdrawAmount > balance) {
                        System.out.println("Insufficient balance!");
                        System.out.printf("Available balance: %.2f%n", balance);
                    } else if (withdrawAmount < 500) {
                        System.out.println("Minimum withdrawal amount is 500.");
                    } else {
                        balance -= withdrawAmount;

                        System.out.println("Withdrawal successful!");
                        System.out.printf("New balance: %.2f%n", balance);
                    }
                    break;

                case 3:
                    System.out.println("\n----------- ACCOUNT BALANCE -------------");
                    System.out.printf("Current balance: %.2f%n", balance);
                    break;

                case 4:
                    System.out.println("\n==========================================");
                    System.out.println("       Thank you for using Java ATM!");
                    System.out.println("              Have a nice day!");
                    System.out.println("==========================================");

                    sc.close();
                    return;

                default:
                    System.out.println("\nInvalid choice!");
                    System.out.println("Please select a number between 1 and 4.");
            }
        }
    }
}
