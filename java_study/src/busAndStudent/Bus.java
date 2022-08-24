package busAndStudent;

public class Bus {
    int busNum;
    int passengerCount;
    int busMoney;

    public Bus(int busNum) {
        this.busNum = busNum;
    }

    public void take (int money) {
        this.busMoney += money;
        passengerCount++;
    }

    public void showBusInfo() {
        System.out.println(busNum + "번의 승객 수는 " + passengerCount + "명 이고, 수입은 " + busMoney + "원 입니다.");
    }
}
