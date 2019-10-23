package chain;

public class TransactionHandler implements Handler {
    private Handler nextHandler;

    // Set the next activity or process
    @Override
    public void nextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public Data process(Data data) {
        System.out.println("Transaction process");
        
        // Doing the transaction process
        data = new Data("Header changed", "Content changed");

        if (nextHandler != null) {
            // Call the next activity
            data = nextHandler.process(data);
        }
        return data;
    }
}
