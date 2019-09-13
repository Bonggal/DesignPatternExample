package Wallet;

public class Main {
    public static void main(String[] args) {
        Wallet wallet = new Wallet.Builder("12345","081278534673")
                .addName("Bonggal")
                .addBalance(100000)
                .built();

        wallet.topUp(new TopUpByBank("123456","112233").pay(10000));
        wallet.topUp(new TopUpByMart("081239849670").pay(35000));

        System.out.println(wallet);
    }

}
