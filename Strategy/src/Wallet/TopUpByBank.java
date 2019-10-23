package Wallet;

public class TopUpByBank implements TopUpStrategy {
    private String accountNumber;
    private String pinNumber;

    public TopUpByBank(String accountNumber, String pinNumber){
        this.accountNumber = accountNumber;
        this.pinNumber = pinNumber;
    }

    @Override
    public int pay(int amount) {
        // Pay process
        System.out.println("Pay using bank: "+amount);
        return amount;
    }
}
