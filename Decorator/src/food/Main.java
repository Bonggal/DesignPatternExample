package food;

public class Main {
    public static void main(String[] args) {
        Food meat = new Meat();
        meat = new AddSalt(meat,true);
        meat.cook();
        System.out.println("Price meat 1: "+meat.price());

        Food meat2 = new Meat();
        meat2 = new AddSugar(meat2, true);
        meat2 = new AddSalt(meat2, true);
        meat2 = new AddSalt(meat2, true);
        meat2.cook();
        System.out.println("Price meat 2: "+meat2.price());
    }
}
