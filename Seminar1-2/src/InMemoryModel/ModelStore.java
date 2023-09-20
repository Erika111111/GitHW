package InMemoryModel;

import ModelElements.*;
import ModelElements.Utils.Angle3D;
import ModelElements.Utils.Point3D;


public class ModelStore implements  IModelChanger {
    public PoligonalModel models;
    public Scene scenes;
    public  Flash flashes;
    public  Camera cameras;
    private IModelChangedObserver changedObserver;

    public ModelStore( IModelChangedObserver changedObserver) {
        this.changedObserver = changedObserver;
        this.models = new PoligonalModel(new Poligon());
        this.cameras = new Camera();
        this.flashes = new Flash();
        this.scenes = new Scene(this.models, this.cameras, this.flashes);
    }

    public Scene getScena(int n){
        return this.scenes;
    }
    @Override
    public void natifyChange(IModelChanger sender) {

    }
}
