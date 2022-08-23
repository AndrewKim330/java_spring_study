package membershipInheritance;

public class VIPCustomer extends Customer {

    double discountRatio;
    private String agentId;

    public VIPCustomer(int customerId, String customerName) {
        super(customerId, customerName);
        bonusRatio = 0.05;
        discountRatio = 0.1;
        customerGrade = "VIP";
        System.out.println("call VIPCustomer(int, string)");
    }

//    public VIPCustomer() {
//        super(0, "no-name");
//        bonusRatio = 0.05;
//        discountRatio = 0.1;
//        customerGrade = "VIP";
//        System.out.println("call VIPCustomer()");
//    }

    public String getAgentId() {
        return agentId;
    }
}
