package homework9.task2;

public class Circle extends Figure{
    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        double perimeterCircle = 2 * Math.PI * radius;
        System.out.println("Perimeter of circle " + perimeterCircle);
        return perimeterCircle;
    }

    @Override
    public void getArea() {
        double areaCircle = Math.PI * radius * radius;
        System.out.println((int) areaCircle);
    }
}
