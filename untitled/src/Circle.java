// класс круг
public class Circle implements IShape{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // имплементированный метод получения площади фигуры
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // имплементированный метод получения периметра фигуры
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
