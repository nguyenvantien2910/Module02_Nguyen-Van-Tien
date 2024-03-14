package ThucHanh01.rikkei.academy.animals;

import ThucHanh01.rikkei.academy.edible.IEdible;

public class Chicken extends Animal implements IEdible {
    @Override
    public String makeSound() {
        return "Chiken : bbbbbbbbbbbbbb";
    }

    @Override
    public String howToEat() {
        return "Could be fried";
    }
}
