package FactoryMethod.application;

import FactoryMethod.animalfamily.Animal;
import FactoryMethod.colorfamily.Color;
import FactoryMethod.factory.AbstractFactory;
import FactoryMethod.factory.FactoryProvider;

public class Main {
    public static void main(String[] args) {
        AbstractFactory abstractFactory;

        abstractFactory = FactoryProvider.getFactory("Toy");
        Animal toy = (Animal) abstractFactory.create("Dog");

        abstractFactory = FactoryProvider.getFactory("Color");
        Color color = (Color) abstractFactory.create("Brown");

        String result = "A " + toy.getAnimal() + " with " + color.getColor() + " color " + toy.makeSound();

        System.out.println(result);
    }
}
