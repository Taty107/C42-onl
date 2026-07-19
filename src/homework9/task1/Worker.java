package homework9.task1;

public class Worker extends Employee {

    public Worker(String name) {
        super("General worker", name);
    }

    @Override
    public void printJobTitle() {
        System.out.println("My name is " + getName() + " I am " + getJobTitle());
    }
}
