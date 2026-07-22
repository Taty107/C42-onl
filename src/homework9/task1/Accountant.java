package homework9.task1;

public class Accountant extends Employee implements Cloneable {
    public Accountant(String name, int age) {
        super("Accountant", name, age);
    }
    @Override
    public void printJobTitle() {
        System.out.println("My name is " + getName() + " my age is " + getAge() + " I am " + getJobTitle());
    }
    @Override
    public Accountant clone() throws CloneNotSupportedException {
        return (Accountant) super.clone();
    }
}
