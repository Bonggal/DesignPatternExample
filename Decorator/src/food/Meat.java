package food;

public class Meat implements Food {
    @Override
    public void cook() {
        System.out.println("The meat is cooked.");
    }

    @Override
    public int price() {
        return 5;
    }
}
