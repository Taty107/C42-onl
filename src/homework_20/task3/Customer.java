package homework_20.task3;

public class Customer implements Runnable {
    private final Store store;

    public Customer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            store.get();
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
