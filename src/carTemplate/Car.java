package carTemplate;

public abstract class Car {
    public abstract void driveCar();
    public abstract void stopCar();

    public void startCar() {
        System.out.println("시동을 켭니다.");
    }

    public void turnOffCar() {
        System.out.println("시동을 끕니다.");
    }

    public void washCar() {};

    public void run() {
        startCar();
        driveCar();
        stopCar();
        turnOffCar();
        washCar();
    }

}
