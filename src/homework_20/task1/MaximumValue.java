package homework_20.task1;

public class MaximumValue implements Runnable {
    private final int[] numbers;
    private int maxValue;

    public MaximumValue(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        maxValue = numbers[0];
        for (int num : numbers){
            if (num > maxValue) {
                maxValue = num;
            }
        }
    }

    public int getMaxValue() {
        return maxValue;
    }
}
