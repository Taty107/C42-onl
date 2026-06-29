package homework6;

import java.util.Scanner;

public class CreditCard {
    public String accountNumber;
    public double initialAmount;

    public String getDisplayInformation(){
        return "On the card number " + accountNumber +
                "\tbalance is: " + initialAmount;
    }

    public void withdrawMoney(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount you want to withdraw from your balance: ");
        double amount = input.nextDouble();
         if (amount > initialAmount) {
             System.out.println("Error! There are not enough funds on your card!");
         } else if (amount > 0) {
             initialAmount -= amount;
             System.out.println(amount + "rub. were debited from your balance.");
         }
    }

    public void creditMoney(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount you want to top up from your balance: ");
        double amount = input.nextDouble();
        if (amount > 0) {
            initialAmount += amount;
            System.out.println(amount + " rub. have been added to your balance.");
        } else {
            System.out.println("Error! The balance should be greater than 0 rub.");

        }

    }
}

