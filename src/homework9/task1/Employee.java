package homework9.task1;

public abstract class Employee implements PrintJob{
    private final String jobTitle;
    private final String name;
    private final int age;


    protected Employee(String jobTitle, String name, int age) {
        this.jobTitle = jobTitle;
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public String getJobTitle() {
        return jobTitle;
    }

    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return "Employee name is " + name
                + "\nHis age is " + age
                + "\nHe is " + jobTitle;
    }
}
