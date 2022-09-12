package FactoryMethod.factory;

import FactoryMethod.animalfamily.Animal;
import FactoryMethod.animalfamily.Dog;
import FactoryMethod.animalfamily.Duck;

public class AnimalFactory implements AbstractFactory{
    @Override
    public Animal create(String animalType) {
        if ("Dog".equalsIgnoreCase(animalType)) {
            return new Dog();
        } else if ("Duck".equalsIgnoreCase(animalType)) {
            return new Duck();
        }
        return null;
    }
}
