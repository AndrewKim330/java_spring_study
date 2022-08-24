package carTemplate;

public class AICar extends Car{

    @Override
    public void driveCar() {
        System.out.println("자율 주행을 합니다.");
        System.out.println("자동차가 스스로 방향을 바꿉니다.");
    }

    @Override
    public void stopCar() {
        System.out.println("장애물 앞에서 멈춥니다.");
    }

    @Override
    public void washCar() {
        System.out.println("자동 세차를 합니다.");
    }
}
