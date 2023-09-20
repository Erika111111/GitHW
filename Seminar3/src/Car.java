public abstract class Car implements IsweepingStreet {
    // марка, модель, цвет, тип кузова, тип топлива, тип коробки передач
    protected  String make, model, color, bodyType,fuelTupe,transmisType;
    protected int numWeels; // число колес
    protected double engineVol; //объем двигателя
    protected  boolean isMoving = false; // движется ли машина
    protected boolean isInService = false; // на обслуживании ли машина

    public Car(String make, String model, String color, String bodyType, String fuelTupe, int numWeels, double engineVol) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.bodyType = bodyType;
        this.fuelTupe = fuelTupe;
        this.transmisType = transmisType;
        this.numWeels = numWeels;
        this.engineVol = engineVol;
    }

    // движение машины
    public void move(boolean isMoving){
        if(this.isMoving == isMoving){
            System.out.println("Машина"+(isMoving ? "в движении" : "стоит"));
            return;
        }
    }

    // обслуживание машины
    public void service(boolean isInService){
        if (this.isInService == isInService){
            System.out.println("машина"+(isInService ? "обслуживается" : "не обслуживается"));
            return;
        }
    }
}
