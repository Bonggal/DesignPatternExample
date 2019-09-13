package food;

abstract class Decorator implements Food {
    Food food;

    Decorator(Food food){
        this.food = food;
    }
}
