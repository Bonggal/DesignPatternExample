package Train;

public class Control {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void giveCommand() {
        command.execute();
    }
}
