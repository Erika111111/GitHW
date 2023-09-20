public class Toyota extends Car implements IcleanMirrows, IcleanLights, IgasStation{
    public Toyota( String model, String color, String bodyType, String fuelTupe, String transmisType, int numWeels, double engineVol) {
        super(model, color, bodyType, fuelTupe, transmisType, numWeels, engineVol);
    }

    @Override
    public void sweepingStreet() {
        System.out.println("Подметание улицы");
    }

    @Override
    public void cleanLights() {
        System.out.println("Фары помыты");
    }

    @Override
    public void cleanMirrows() {
        System.out.println("Зеркала помыты");
    }

    @Override
    public void gasStation() {
        System.out.println("Машина"+this.make+"заправляется"+this.fuelTupe);
    }
}
