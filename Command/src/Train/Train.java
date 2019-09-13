package Train;

public class Train {
    private int speed = 0;

    void speedUp() {
        speed = speed + 1;
        showSpeed();
    }

    void slowDown() {
        speed = speed - 1;
        showSpeed();
    }

    private void showSpeed() {
        System.out.println("Speed: " + speed);
    }
}
