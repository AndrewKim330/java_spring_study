package membershipPoly;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {

        ArrayList<Customer> customerList = new ArrayList<>();

        Customer customerA = new Customer(10010, "A");
        customerList.add(customerA);

        Customer customerB = new Customer(10020, "B");
        customerList.add(customerB);

        Customer customerC = new GoldCustomer(10030, "C");
        customerList.add(customerC);

        Customer customerD = new GoldCustomer(10040, "D");
        customerList.add(customerD);

        Customer customerE = new VIPCustomer(10050, "E");
        customerList.add(customerE);

//        // using polymorphism
//        for(Customer customer: customerList) {
//            System.out.println(customer.showCustomerInfo());
//        }

//        int price = 10000;
//        for(Customer customer: customerList) {
//            int cost = customer.calcPrice(price);
//            System.out.println(customer.getCustomerName() + "님이 " + cost + "원을 지불하셨습니다.");
//            System.out.println(customer.getCustomerName() + "님의 현재 보너스 포인트는 " + customer.bonusPoint + "점입니다.");
//        }

        // using instanceOf
//        VIPCustomer vc = (VIPCustomer) customerC; // expected to error
        if (customerC instanceof VIPCustomer) {
            VIPCustomer vc = (VIPCustomer) customerC;
        }

    }
}
