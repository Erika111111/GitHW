public class Main {
    public static void main(String[] args) {
        GeometricFigures figureBox = new GeometricFigures();
        Circle circle1 = new Circle(10);
        Rectangle rectangle1 = new Rectangle(5,4);
        figureBox.add(circle1);
        figureBox.add(rectangle1);

        figureBox.remove(0);
        figureBox.searchFigure(rectangle1);

    }
}