package daffanaufal.application;

import daffanaufal.data.City;
import daffanaufal.data.Location;

public class LocationApp {
    public static void main(String[] args) {

        // var location = new Location(); // Error
        var city = new City();
        city.name = "Jakarta";

        System.out.println(city.name);

    }
}
