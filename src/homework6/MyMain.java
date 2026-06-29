package homework6;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        CreditCard cardOne = new CreditCard();
        CreditCard cardTwo = new CreditCard();
        CreditCard cardThree = new CreditCard();

        cardOne.accountNumber = "12121212";
        cardOne.initialAmount = 2500;
        cardTwo.accountNumber = "34343434";
        cardTwo.initialAmount = 5750;
        cardThree.accountNumber = "56565656";
        cardThree.initialAmount = 4520.5;
        carryOutTransactions(cardOne, cardTwo, cardThree);

        System.out.println("*".repeat(80));

        ATMHomework cashMachine = new ATMHomework();
        cashMachine.balance = 30476;
        cashMachine.banknotesTwenty = 100;
        cashMachine.banknotesFifty = 100;
        cashMachine.banknotesHundred = 100;
        cashMachine.addingMoney();
        cashMachine.getMoney();
    }

    public static void carryOutTransactions(CreditCard cardOne, CreditCard cardTwo, CreditCard cardThree) {
        boolean isRan = true;
        do{
            System.out.println("Hi! Please select which operation you want to perform:"
                    + "\n 1. Check balance"
                    + "\n 2. Top up your balance"
                    + "\n 3. Withdraw money"
                    + "\n 4. Log out ")
            ;
            int choice = getInput().nextInt();
            int numCard;
            switch (choice) {
                case 1:
                    System.out.println("Which card do you want to check the balance on?"
                            + "\n 1. Card One"
                            + "\n 2. Card Two"
                            + "\n 3. Card Three")
                    ;
                    numCard = getInput().nextInt();
                    if (numCard == 1) {
                        System.out.println(cardOne.getDisplayInformation());
                    } else if (numCard == 2) {
                        System.out.println(cardTwo.getDisplayInformation());
                    } else if (numCard == 3) {
                        System.out.println(cardThree.getDisplayInformation());
                    } else {
                        System.out.println("Error! The selected card does not exist!");
                    }
                    break;
                case 2:
                    System.out.println("Which card do you want to top up?"
                            + "\n 1. Card One"
                            + "\n 2. Card Two"
                            + "\n 3. Card Three")
                    ;
                    numCard = getInput().nextInt();
                    if (numCard == 1) {
                        cardOne.creditMoney();
                    } else if (numCard == 2) {
                        cardTwo.creditMoney();
                    } else if (numCard == 3) {
                        cardThree.creditMoney();
                    } else {
                        System.out.println("Error! The selected card does not exist!");
                    }
                    break;
                case 3:
                    System.out.println("Which card do you want to withdraw money?"
                            + "\n 1. Card One"
                            + "\n 2. Card Two"
                            + "\n 3. Card Three")
                    ;
                    numCard = getInput().nextInt();
                    if (numCard == 1) {
                        cardOne.withdrawMoney();
                    } else if (numCard == 2) {
                        cardTwo.withdrawMoney();
                    } else if (numCard == 3) {
                        cardThree.withdrawMoney();
                    } else {
                        System.out.println("Error! The selected card does not exist!");
                    }
                    break;
                case 4:
                    System.out.println("Thank you. I wish you well!");
                    isRan = false;
                    break;
                default:
                    System.out.println("Invalid menu item. Try again!");
            }
        } while(isRan);
    }

    public static Scanner getInput(){
        return new Scanner(System.in);
    }
}
