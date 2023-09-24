import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class GeometricFigures {
    static private List<IShape> toolbox;

    public GeometricFigures() {
        toolbox = new ArrayList<IShape>();
    }

    // метод для добавления новой фигуры
    public  void add(IShape figure){
        toolbox.add(figure);
    }
    // метод для удаления новой фигуры
    public void remove(int num){
        toolbox.remove(num);
    }
    // метод для поиска нужной фигуры
    public void searchFigure(IShape figure){
        int index = toolbox.indexOf(figure);
        if(index >= 0){
            System.out.printf("фигура находится под индексом %d",index);
        }else {
            System.out.println("нет такой фигуры");
        }
    }



}
