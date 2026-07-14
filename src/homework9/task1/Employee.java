package homework9.task1;

public abstract class Employee {
    private final String jobTitle;
    private final String name;

    protected Employee(String jobTitle, String name) {
        this.jobTitle = jobTitle;
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public abstract void printJobTitle();

    @Override
    public String toString() {
        return "This employee`s name is " + name + ". He is " + jobTitle;
    }
}
