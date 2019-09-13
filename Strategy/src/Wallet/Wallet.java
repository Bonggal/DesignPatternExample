package Wallet;

public class Wallet {
    public static class Builder{
        private String accountNumber;
        private String name;
        private int balance;
        private String phoneNumber;

        public Builder(String accountNumber, String phoneNumber){
            this.accountNumber=accountNumber;
            this.phoneNumber=phoneNumber;
        }

        public Builder addBalance(int amount){
            this.balance=amount;
            return this;
        }

        public Builder addName(String name){
            this.name=name;
            return this;
        }

        public Wallet built(){
            return new Wallet(this);
        }
    }

    private String accountNumber;
    private String name;
    private int balance;
    private String phoneNumber;

    private Wallet(Builder builder) {
        this.accountNumber = builder.accountNumber;
        this.name = builder.name;
        this.balance = builder.balance;
        this.phoneNumber = builder.phoneNumber;
    }

    public void topUp(int amount) {
        this.balance = this.balance + amount;
    }

    @Override
    public String toString() {
        return "Wallet:\n" +
                "accountNumber = " + accountNumber + "\n" +
                "name          = " + name + "\n" +
                "balance       = " + balance + "\n\n";
    }
}
