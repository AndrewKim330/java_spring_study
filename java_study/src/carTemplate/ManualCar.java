package carTemplate;

public class ManualCar extends Car{
    @Override
    public void driveCar() {
        System.out.println("사람이 운전합니다.");
        System.out.println("사람이 핸들을 조작합니다.");
    }

    @Override
    public void stopCar() {
        System.out.println("장애물 앞에서 브레이크를 밟아 정지합니다.");
    }
}
