package homework9.task1;

public class Accountant extends Employee  {

    public Accountant(String name) {
        super("Accountant", name);
    }

    @Override
    public void printJobTitle() {
        System.out.println("My name is " + getName() + " I am " + getJobTitle());
    }
}
