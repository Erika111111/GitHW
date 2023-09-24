// класс прямоугольник
public class Rectangle implements IShape{

    //длинна прямоугольника
    private double lengthRec;

    //ширина прямоугольгика
    private double widthRec;

    public Rectangle(double lengthRec, double widthRec) {
        this.lengthRec = lengthRec;
        this.widthRec = widthRec;
    }

    @Override
    //имплементированный метод получения площади фигуры
    public double getArea() {
        return lengthRec * widthRec;
    }

    @Override
    // имплементированный метод получения периметра фигуры
    public double getPerimeter() {
        return (lengthRec + widthRec) * 2;
    }

    public double getLengthRec() {
        return lengthRec;
    }

    public double getWidthRec() {
        return widthRec;
    }

    public void setLengthRec(double lengthRec) {
        this.lengthRec = lengthRec;
    }

    public void setWidthRec(double widthRec) {
        this.widthRec = widthRec;
    }
}
