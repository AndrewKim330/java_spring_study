package customer;

public class Customer implements Buy, Sell{
    @Override
    public void buy() {
        System.out.println("customer sell");
    }

    @Override
    public void sell() {
        System.out.println("customer buy");
    }

    public void order(){
//        Buy.super.order(); // using Buy interface
//        Sell.super.order(); // using Sell interface
        System.out.println("customer order"); // override own way
    }

    public void hello(){
        System.out.println("hello");
    }
}
