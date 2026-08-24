package homework_20.task1;

public class MinimumValue implements Runnable{
    private final int[] numbers;
    private int minValue;

    public MinimumValue(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        minValue = numbers[0];
        for (int num : numbers) {
            if (num < minValue) {
                minValue = num;
            }
        }
    }

    public int getMinValue() {
        return minValue;
    }
}
