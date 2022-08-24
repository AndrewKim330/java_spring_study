package customer;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();

        customer.buy();
        customer.sell();
        customer.order();
        customer.hello();

        Buy buyer = customer; // upcasting
        buyer.buy();
        buyer.order(); // virtual method

        Sell seller = customer; // upcasting
        seller.sell();
        seller.order(); // virtual method
    }
}
