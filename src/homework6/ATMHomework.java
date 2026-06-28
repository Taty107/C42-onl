package homework6;

import java.util.Scanner;

public class ATMHomework {
    public int balance;
    public int banknotesTwenty;
    public int banknotesFifty;
    public int banknotesHundred;

    public void addingMoney() {
        Scanner input = new Scanner(System.in);
        System.out.println("How many 100 bills you was add?");
        int add100 = input.nextInt();
        banknotesHundred += add100;

        System.out.println("How many 50 bills you was add?");
        int add50 = input.nextInt();
        banknotesFifty += add50;

        System.out.println("How many 20 bills you was add?");
        int add20 = input.nextInt();
        banknotesTwenty += add20;

        System.out.println("The ATM was replenished");
        System.out.println("Banknote 20\t" + banknotesTwenty + " bills, banknote 50 " + banknotesFifty + " bills, "
                + "\nbanknote 100 " + banknotesHundred + "\tbills."
        );
    }

    public boolean getMoney() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the amount you wish to withdraw: ");
        int sum = input.nextInt();
        if (sum < 20 || sum % 10 != 0) {
            System.out.println("ERROR! The amount must be a multiple of 10 and not less than 20.");
            return false;
        }

        if (sum > balance) {
            System.out.println("ERROR! There are insufficient funds in your balance.");
            return false;
        }
        int get20 = 0;
        int get50 = 0;
        int get100 = 0;

        while (sum > 0) {
            if (sum >= 100 && banknotesHundred > 0) {
                sum -= 100;
                banknotesHundred--;
                get100++;
            } else if (sum >= 50 && banknotesFifty > 0) {
                if ((sum == 60 || sum == 80) && banknotesTwenty > 0) {
                    sum -= 20;
                    banknotesTwenty--;
                    get20++;
                } else {
                    sum -= 50;
                    banknotesFifty--;
                    get50++;
                }
            } else if (sum >= 20 && banknotesTwenty > 0) {
                sum -= 20;
                banknotesTwenty--;
                get20++;
            } else {
                System.out.println("ERROR! The ATM doesn't have enough bills to dispense this amount.");
                return false;
            }
        }
        balance -= sum;
        System.out.println("The amount was issued in banknotes:");
        System.out.println("Denomination 20 " + get20
                + "\nDenomination 50 " + get50
                + "\nDenomination 100 " + get100);
        return true;
    }
}
