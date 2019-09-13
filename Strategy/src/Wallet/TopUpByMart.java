package Wallet;

public class TopUpByMart implements TopUpStrategy {
    private String phoneNumber;

    public TopUpByMart(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public int pay(int amount) {
        System.out.println("Pay by Mart: "+amount);
        return amount;
    }
}
