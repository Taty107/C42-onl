package homework9;

import homework9.task1.*;
import homework9.task2.*;

public class MyMain {
    public static void main(String[] args){
        System.out.println("Task 1");
        //getJobTitle();
        System.out.println("^".repeat(50));
        System.out.println("Task 2");
        //getSumAllPerimeter();
        System.out.println("^".repeat(50));
        System.out.println("Task*");
        cloneShallowObject();
    }

    public static void getJobTitle(){
        Employee employee1 = new Director("Kirill", 54);
        Employee employee2 = new Accountant("Irina", 22);
        Employee employee3 = new Worker("Boris", 33);
        employee3.printJobTitle();
        System.out.println("~".repeat(60));
        employee2.printJobTitle();
        System.out.println("~".repeat(60));
        employee1.printJobTitle();
    }

    public static void getSumAllPerimeter(){
        Figure[] figures = new Figure[]{
                new Rectangle(5, 8),
                new Triangle(3, 6, 9),
                new Circle(15),
                new Rectangle(10, 10),
                new Circle(23)
        };
        double sumPerimeter = 0;
        for (Figure figure : figures) {
            sumPerimeter += figure.getPerimeter();
        }
        System.out.println();
        System.out.printf("The sum of the perimeter of all figures is %.2f%n", sumPerimeter);
    }

    public static void cloneShallowObject(){
        Accountant accountant = new Accountant("Artyom", 35);
        System.out.println("Accountant before clone ");
        accountant.printJobTitle();
        System.out.println("^".repeat(50));
        Accountant clone;
        try {
            clone = accountant.clone();
            System.out.println("Clone accountant ");
            clone.printJobTitle();
        } catch (Exception e) {
            System.out.println("The object cannot be cloned.");
        }
    }
}
