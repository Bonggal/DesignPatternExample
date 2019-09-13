package Train;

public class SlowDown implements Command {
    private Train train;

    public SlowDown(Train train) {
        this.train = train;
    }

    @Override
    public void execute() {
        train.slowDown();
    }
}
