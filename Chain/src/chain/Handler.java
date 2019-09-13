package chain;

public interface Handler {
    void nextHandler(Handler nextHandler);
    Data process(Data data);
}
