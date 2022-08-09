package membershipInheritance;

public class CustomerTest {
    public static void main(String[] args) {
//        Customer customerLee = new Customer();
//        customerLee.setCustomerName("이순신");
//        customerLee.setCustomerId(10010);
//        customerLee.bonusPoint = 1000;
//        System.out.printf(customerLee.showCustomerInfo());

//        VIPCustomer customerKim = new VIPCustomer();
        VIPCustomer customerKim = new VIPCustomer(10020, "이순신");
//        customerKim.setCustomerName("김유신");
//        customerKim.setCustomerId(10020);
        customerKim.bonusPoint = 10000;
        System.out.printf(customerKim.showCustomerInfo());

        // upCasting
        Customer vc = new VIPCustomer(12345,"noName");
<<<<<<< HEAD
        vc.
=======
>>>>>>> ce3b314 (feat: Construct class for making membership management program with class inheritance)
    }
}
