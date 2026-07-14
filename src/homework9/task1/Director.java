package homework9.task1;

public class Director extends Employee {

    public Director(String jobTitle, String name) {
        super(jobTitle, name);
    }

    @Override
    public void printJobTitle() {
        System.out.println("This employee`s position is " + getJobTitle());
    }


}
