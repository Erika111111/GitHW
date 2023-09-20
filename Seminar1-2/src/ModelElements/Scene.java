package ModelElements;

public class Scene {
    public int id;
    public PoligonalModel models;
    public Flash flashes;

    public  Camera camera;

    public Scene(PoligonalModel models, Flash flashes, Camera camera){
        this.models = models;
        this.flashes = flashes;
        this.camera = camera;
    }

}
