package homework2;

public class startJava {
    public static void main(String[] args) {
        calculate();
        sumOfDigitsOne();
        sumOfDigits();
        roundingNumber();
        resultOfDivision();
        swapValues();
    }

    public static void calculate(){
        int b = 10;
        int c = 25;
        int a = 4*(b+c-1)/2;
        System.out.println(a);
    }

    public static void sumOfDigitsOne(){
        int n = 38;
        int tens = n / 10;
        int units = n % 10;
        int sum = tens + units;
        System.out.println(sum);
    }

    public static void sumOfDigits(){
        int n = 235;
        int hundred = n / 100;
        int tens = n /10;
        int tensPct = tens % 10;
        int units = n % 10;
        int sum = hundred + tensPct + units;
        System.out.println(sum);
    }

    public static void roundingNumber(){
        double n = 27.344;
        System.out.println((int) n);
    }

    public static void resultOfDivision(){
        int q = 87;
        int w =9;
        System.out.println("Результат деления q на w равен " + q / w + "и в остатке " + q % w);
    }

    public static void swapValues(){
        int a = 8;
        int b = 28;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);
    }
}
