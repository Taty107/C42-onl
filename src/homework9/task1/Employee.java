package homework9.task1;

public abstract class Employee implements PrintJob{
    private final String jobTitle;
    private final String name;

    protected Employee(String jobTitle, String name) {
        this.jobTitle = jobTitle;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }
}
