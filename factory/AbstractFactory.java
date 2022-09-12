package FactoryMethod.factory;

public interface AbstractFactory<T> {
    T create(String type);
}
