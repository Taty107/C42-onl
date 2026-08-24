package homework_20.task3;

public class Store {
    private int productCount = 0;
    private final int CAPACITY = 3;

    public synchronized void put() {
        while (productCount >= CAPACITY) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        productCount++;
        System.out.println("The producer delivered one product. Total products in the store: " + productCount);
        notifyAll();
    }

    public synchronized void get() {
        while (productCount <= 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        productCount--;
        System.out.println("The customer bought one product. There are still products left in the store.: " + productCount);
        notifyAll();
    }
}
