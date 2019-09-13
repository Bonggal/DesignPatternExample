package Train;

public class Main {
    public static void main(String[] args) {
        Train train = new Train();
        Control control = new Control();

        Command speedUp = new SpeedUp(train);
        Command slowDown = new SlowDown(train);

        control.setCommand(speedUp);
        control.giveCommand();
        control.giveCommand();
        control.giveCommand();
        control.giveCommand();

        control.setCommand(slowDown);
        control.giveCommand();
    }
}
