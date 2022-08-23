package membershipOverriding;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer(10010, "이순신");
        customerLee.bonusPoint = 1000;
        int price = customerLee.calcPrice(1000);
        System.out.printf(customerLee.showCustomerInfo() + price);

        VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
        price = customerKim.calcPrice(1000);
        customerKim.bonusPoint = 10000;
        System.out.printf(customerKim.showCustomerInfo() + price);

        // upCasting
        Customer vc = new VIPCustomer(12345,"noName");
        price = vc.calcPrice(1000);
        System.out.printf(customerKim.showCustomerInfo() + price);
    }
}
