package daffanaufal.application;

import static daffanaufal.data.Application.PROCESSORS;
import static daffanaufal.data.Constant.*;
import daffanaufal.data.Country;
import daffanaufal.util.MathUtil;

public class StaticApp {
    public static void main(String[] args) {

        // Static Variable
        System.out.println(APPLICATION);
        System.out.println(VERSION);

        // Static Method
        System.out.println(MathUtil.sum(1,1,1,1,1));

        // Static Class
        Country.City city = new Country.City();
        city.setName("Jakarta");

        System.out.println(city.getName());

        // Static Block
        System.out.println(PROCESSORS);
    }
}
