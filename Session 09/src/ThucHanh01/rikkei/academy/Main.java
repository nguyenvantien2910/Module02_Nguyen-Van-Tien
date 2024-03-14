package ThucHanh01.rikkei.academy;

import ThucHanh01.rikkei.academy.animals.Animal;
import ThucHanh01.rikkei.academy.animals.Chicken;
import ThucHanh01.rikkei.academy.animals.Tiger;
import ThucHanh01.rikkei.academy.edible.IEdible;
import ThucHanh01.rikkei.academy.fruit.Apple;
import ThucHanh01.rikkei.academy.fruit.Fruit;
import ThucHanh01.rikkei.academy.fruit.Orange;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();

        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                IEdible edible = (Chicken) animal;
                System.out.println(edible.howToEat());
            }
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();

        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
