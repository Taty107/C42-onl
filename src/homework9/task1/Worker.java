package homework9.task1;

public class Worker extends Employee {

    public Worker(String name, int age) {
        super("General worker", name, age);
    }

    @Override
    public void printJobTitle() {
        System.out.println("My name is " + getName() + " I am " + getJobTitle());
    }
}
