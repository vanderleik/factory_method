package FactoryMethod.factory;

import FactoryMethod.colorfamily.Brown;
import FactoryMethod.colorfamily.Color;
import FactoryMethod.colorfamily.White;

public class ColorFactory implements AbstractFactory {
    @Override
    public Color create(String colorType) {
        if ("Brown".equalsIgnoreCase(colorType)) {
            return new Brown();
        } else if ("White".equalsIgnoreCase(colorType)) {
            return new White();
        }
        return null;
    }
}
