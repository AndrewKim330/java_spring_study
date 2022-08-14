package interfaceExample;

public class CompleteCalc extends Calculator{
    @Override
    public int times(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public double divide(double num1, double num2) {
        if(num2 == 0) {
            return ERROR;
        }
        return num1 / num2;
    }

    public void showInfo() {
        System.out.println("모두 구현했습니다.");
    }
}
