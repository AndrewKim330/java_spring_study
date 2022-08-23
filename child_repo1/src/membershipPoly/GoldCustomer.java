package membershipPoly;

public class GoldCustomer extends Customer {

    double discountRatio;

    public GoldCustomer(int customerId, String customerName) {
        super(customerId, customerName);

        discountRatio = 0.1;
        bonusRatio = 0.02;
        customerGrade = "GOLD";
    }

    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price * discountRatio);
    }

}
