package homework9.task2;

public class Triangle extends Figure{
    private final int sideTriangleA;
    private final int sideTriangleB;
    private final int sideTriangleC;

    public Triangle(int sideTriangleA, int sideTriangleB, int sideTriangleC) {
        this.sideTriangleA = sideTriangleA;
        this.sideTriangleB = sideTriangleB;
        this.sideTriangleC = sideTriangleC;
    }


    @Override
    public double getPerimeter() {
        int perimeterTriangle = sideTriangleA + sideTriangleB + sideTriangleC;
        System.out.println("Perimeter of triangle " + perimeterTriangle);
        return perimeterTriangle;
    }

    @Override
    public void getArea() {
        int semiPerimeter = (sideTriangleA + sideTriangleB + sideTriangleC) /2;
        int p = (semiPerimeter * (semiPerimeter - sideTriangleA) * (semiPerimeter - sideTriangleB) *
                (semiPerimeter - sideTriangleC));
        double areaTriangle = Math.sqrt(p);
        System.out.println("Area of a triangle with side A " + sideTriangleA +
                " side B " + sideTriangleB + " and side C" + sideTriangleC +" is equal about " + (int) areaTriangle)
        ;
    }
}
