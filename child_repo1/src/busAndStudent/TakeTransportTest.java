package busAndStudent;

public class TakeTransportTest {
    public static void main(String[] args) {
        Student studentJ = new Student("James", 5000);
        Student studentT = new Student("Thomas", 10000);

        Bus bus100 = new Bus(100);
        Bus bus500 = new Bus(500);

        studentJ.takeBus(bus100);

        Subway subwayGreen = new Subway(2);
        Subway subwayBlue = new Subway(1);

        studentT.takeSubway(subwayGreen);

        studentJ.showInfo();
        studentT.showInfo();

        bus100.showBusInfo();
        bus500.showBusInfo();

        subwayBlue.showSubwayInfo();
        subwayGreen.showSubwayInfo();


    }
}
