package interfaceExample;

public class CalcTest {
    public static void main(String[] args) {
//        CompleteCalc calc = new CompleteCalc();
        int num1 = 10;
        int num2 = 2;
        Calc calc = new CompleteCalc();

        System.out.println(calc.add(num1, num2));
        System.out.println(calc.subtract(num1, num2));
        System.out.println(calc.times(num1, num2));
        System.out.println(calc.divide(num1, num2));

    }
}
