package chain;

public class AuthenticationHandler implements Handler {
    private Handler nextHandler;

    @Override
    public void nextHandler(Handler nextHandler) {
        this.nextHandler=nextHandler;
    }

    @Override
    public Data process(Data data) {
        System.out.println("Authentication process");

        if (nextHandler != null) {
            data = nextHandler.process(data);
        }
        return data;
    }
}
