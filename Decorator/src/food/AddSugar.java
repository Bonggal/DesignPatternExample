package food;

public class AddSugar extends Decorator{
    private boolean sugar;

    AddSugar(Food food, boolean sugar) {
        super(food);
        this.sugar = sugar;
    }

    @Override
    public void cook() {
        food.cook();
        System.out.println("Sugar: "+sugar);
    }

    @Override
    public int price() {
        return food.price()+2;
    }
}
