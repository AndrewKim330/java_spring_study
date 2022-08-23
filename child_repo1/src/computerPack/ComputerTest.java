package computerPack;

public class ComputerTest {
    public static void main(String[] args) {
        Desktop desktop = new Desktop();
//        Computer desktop = new Desktop(); // upcasting
//        Computer computer = new Computer(); // expected to error
        desktop.display();
    }
}
