package daffanaufal.application;

import daffanaufal.annotation.Fancy;
import daffanaufal.data.*;

@Fancy(name = "AnimalApp", tags = {"application", "java"})
public class Application {
    public static void main(String[] args) {
        Product product = new Product("Macbook Pro", 30_000_000);
        System.out.println(product.name);
        System.out.println(product.price);

        Data data = new Data();
    }
}
