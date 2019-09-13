package chain;

public class TransactionHandler implements Handler {
    private Handler nextHandler;

    @Override
    public void nextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public Data process(Data data) {
        System.out.println("Transaction process");
        data = new Data("Header changed", "Content changed");

        if (nextHandler != null) {
            data = nextHandler.process(data);
        }
        return data;
    }
}
