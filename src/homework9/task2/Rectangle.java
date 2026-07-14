package homework9.task2;

public class Rectangle extends Figure{
    private final int sideRectangleA;
    private final int sideRectangleB;

    public Rectangle(int sideRectangleA, int sideRectangleB) {
        this.sideRectangleA = sideRectangleA;
        this.sideRectangleB = sideRectangleB;
    }

    @Override
    public double getPerimeter() {
        int perimeterRectangle = sideRectangleA * sideRectangleB;
        System.out.println("Perimeter of rectangle " + perimeterRectangle);
        return perimeterRectangle;
    }

    @Override
    public void getArea() {
        int areaRectangle = 2 * (sideRectangleA + sideRectangleB);
        System.out.println("Area of a rectangle with side A " + sideRectangleA +
                "\tand side B " + sideRectangleB + " is equal to " + areaRectangle)
        ;
    }
}
