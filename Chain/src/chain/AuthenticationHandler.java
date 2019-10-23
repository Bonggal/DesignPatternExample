package chain;

// Activity 1: Do authentication
public class AuthenticationHandler implements Handler {
    private Handler nextHandler;

    // Set the next activity or process
    @Override
    public void nextHandler(Handler nextHandler) {
        this.nextHandler=nextHandler;
    }

    // Activity process
    @Override
    public Data process(Data data) {
        System.out.println("Authentication process");
        
        // Doing the authentication process here

        if (nextHandler != null) {
            // Calling the next activity
            data = nextHandler.process(data);
        }
        return data;
    }
}
