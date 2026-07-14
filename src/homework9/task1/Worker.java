package homework9.task1;

public class Worker extends Employee {

    public Worker(String jobTitle, String name) {
        super(jobTitle, name);
    }

    @Override
    public void printJobTitle() {
        System.out.println("This employee`s position is " + getJobTitle());
    }


}
