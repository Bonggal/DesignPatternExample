package food;

public class AddSalt extends Decorator {
    private boolean salt;

    AddSalt(Food food, boolean salt) {
        super(food);
        this.salt = salt;
    }

    @Override
    public void cook() {
        food.cook();
        System.out.println("Salt: "+salt);
    }

    @Override
    public int price() {
        return food.price()+1;
    }
}
