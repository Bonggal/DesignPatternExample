package Train;

public class SpeedUp implements Command {
    private Train train;

    public SpeedUp(Train train) {
        this.train = train;
    }

    @Override
    public void execute() {
        train.speedUp();
    }
}
