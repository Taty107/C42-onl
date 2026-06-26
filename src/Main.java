import homework6.CreditCard;

import java.util.Scanner;

public class Main {
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
    }

    public static void carryOutTransactions(CreditCard cardOne, CreditCard cardTwo, CreditCard cardThree) {
        System.out.println("Hi! Please select which operation you want to perform:"
                             + "\n 1. Check balance"
                             + "\n 2. Top up your balance"
                             + "\n 3. Withdraw money")
        ;
        int choice = getInput().nextInt();

        do{
            if (choice == 1) {
                System.out.println("Which card do you want to check the balance on?"
                        + "\n Card One"
                        + "\n Card Two"
                        + "\n Card Three")
                ;
                String nameCard = getInput().nextLine();
                switch (nameCard) {
                    case "Card One":
                        System.out.println(cardOne.accountNumber + " card balance " + cardOne.initialAmount);
                        break;
                    case "Card Two":
                        System.out.println(cardTwo.accountNumber + " card balance " + cardTwo.initialAmount);
                        break;
                    case "Card Three":
                        System.out.println(cardThree.accountNumber + " card balance " + cardThree.initialAmount);
                        break;
                    default:
                        System.out.println("The card name is incorrect!");
                }
            } else if (choice == 2) {
                System.out.println("Which card do you want to top up?"
                        + "\n Card One"
                        + "\n Card Two"
                        + "\n Card Three")
                ;
                String nameCard = getInput().nextLine();
                 switch (nameCard) {
                     case "Card One":
                         cardOne.creditMoney();
                         break;
                     case "Card Two":
                         cardTwo.creditMoney();
                         break;
                     case "Card Three":
                         cardThree.creditMoney();
                         break;
                     default:
                         System.out.println("The card name is incorrect!");
                 }
            } else if (choice == 3) {
                System.out.println("Which card do you want to top up?"
                        + "\n Card One"
                        + "\n Card Two"
                        + "\n Card Three")
                ;
                String nameCard = getInput().nextLine();
                switch (nameCard) {
                    case "Card One":
                        cardOne.withdrawMoney();
                        break;
                    case "Card Two":
                        cardTwo.withdrawMoney();
                        break;
                    case "Card Three":
                        cardThree.withdrawMoney();
                        break;
                    default:
                        System.out.println("The card name is incorrect!");
                }
            } else if (choice <= 0) {
                System.out.println("Error!! Select correct operation!");
                break;
            }
        } while(true);
    }

    public static Scanner getInput(){
        return new Scanner(System.in);
    }
}