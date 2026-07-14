package homework9;

import homework9.task1.Accountant;
import homework9.task1.Director;
import homework9.task1.Employee;
import homework9.task1.Worker;
import homework9.task2.Circle;
import homework9.task2.Figure;
import homework9.task2.Rectangle;
import homework9.task2.Triangle;

public class MyMain {
    public static void main(String[] args){
        System.out.println("Task 1");
        getJobTitle();

        System.out.println();
        System.out.println("Task 2");
        getSumAllPerimeter();
    }

    public static void getJobTitle(){
        Employee employee1 = new Director("director", "John");
        Employee employee2 = new Accountant("accountant", "Irina");
        Employee employee3 = new Worker("general worker", "Boris");

        System.out.println();
        employee1.printJobTitle();
        System.out.println("~".repeat(60));
        employee2.printJobTitle();
        System.out.println("~".repeat(60));
        System.out.println(employee3);
        System.out.println("~".repeat(60));
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
        System.out.println("The sum of the perimeter of all figures is " + sumPerimeter);
    }
}
