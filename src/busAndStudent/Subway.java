package busAndStudent;

public class Subway {

    int subwayNum;
    int passengerCount;
    int subwayMoney;

    public Subway(int subwayNum) {
        this.subwayNum = subwayNum;
    }

    public void take (int money) {
        this.subwayMoney = money;
        passengerCount++;
    }

    public void showSubwayInfo() {
        System.out.println(subwayNum + "번의 승객 수는 " + passengerCount + "명 이고, 수입은 " + subwayMoney + "원 입니다.");
    }

}
