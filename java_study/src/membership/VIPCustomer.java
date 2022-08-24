package membership;

public class VIPCustomer extends Customer{

    double discountRatio;
    private String agentId;

    public VIPCustomer() {
        bonusRatio = 0.05;
        discountRatio = 0.1;
        customerGrade = "VIP";
    }

    public String getAgentId() {
        return agentId;
    }
}
