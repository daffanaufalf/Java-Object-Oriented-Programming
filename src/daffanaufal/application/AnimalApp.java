package daffanaufal.application;

import daffanaufal.data.Animal;
import daffanaufal.data.Cat;

public class AnimalApp {
    public static void main(String[] args) {

        Animal animal = new Cat();
        animal.name = "Echan";
        animal.run();

    }
}
