package daffanaufal.data;

import daffanaufal.annotation.Fancy;

@Fancy(name = "Car", tags = {"interface", "java"})
public interface Car extends HasBrand, IsMaintenance {
    void drive();

    int getTire();

    default boolean isBig() {
        return false;
    }
}
