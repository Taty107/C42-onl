package homework9.task1;

public class Director extends Employee {

    public Director(String name) {
        super("Director", name);
    }

    @Override
    public void printJobTitle() {
        System.out.println("My name is " + getName() + " I am " + getJobTitle());
    }
}
