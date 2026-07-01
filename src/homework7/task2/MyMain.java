package homework7.task2;

public class MyMain {
    public static void main(String[] args) {

        Apple appleOriginally = new Apple();
        System.out.println("The apple was originally " + appleOriginally.getColor());
        Apple apple = new Apple("orange");
        System.out.println("New color is " + apple.getColor());
    }
}
