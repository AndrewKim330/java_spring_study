package membershipOverriding;

public class VIPCustomer extends Customer {

    double discountRatio;
    private String agentId;

    public VIPCustomer(int customerId, String customerName) {
        super(customerId, customerName);
        bonusRatio = 0.05;
        discountRatio = 0.1;
        customerGrade = "VIP";
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        price -= (int)(price * discountRatio);
        return price;
    }

    public String getAgentId() {
        return agentId;
    }
}
