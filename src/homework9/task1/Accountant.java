package homework9.task1;

public class Accountant extends Employee implements Cloneable {
    public Accountant(String name) {
        super("Accountant", name);
    }
    @Override
    public void printJobTitle() {
        System.out.println("My name is " + getName() + " I am " + getJobTitle());
    }
    @Override
    public Accountant clone() {
        try {
            return (Accountant) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
