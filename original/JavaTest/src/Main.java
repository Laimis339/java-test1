
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double budgetMonth;
        double expenses;
        double totalExpenses = 0.0;
        double balance;
        Scanner keyboard = new Scanner(System.in);
        System.out.print( "What is your monthly budget?\n $ ");
        budgetMonth = keyboard.nextDouble();
        do {
            System.out.print("Enter expenses: $ ");
            expenses = keyboard.nextDouble();
            System.out.println();
            totalExpenses += expenses;
            System.out.println("Add another expense or enter 0 to calculate your balance...");
        } while (expenses > 0);
        balance = budgetMonth - totalExpenses;
        if (balance < 0) {
            System.out.println(" You are over budget by: $ " + balance);
        } else if (balance > 0) {
            System.out.println("You are under budget. Your remaining balance is: $ " + balance);
        } else {
            System.out.println("You spent your budget" + balance);
        }
    }
}

