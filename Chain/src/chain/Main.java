package chain;

public class Main {
    public static void main(String[] args) {
        Data data = new Data("Header", "Content");

        Handler transaction = new TransactionHandler();
        Handler authentication = new AuthenticationHandler();
        authentication.nextHandler(transaction);
        data = authentication.process(data);

        System.out.println(data);
    }
}
