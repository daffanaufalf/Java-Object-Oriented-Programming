package daffanaufal.application;

import daffanaufal.data.CreateUserRequest;
import daffanaufal.util.ValidationUtil;

public class ReflectionApp {
    public static void main(String[] args) {

        CreateUserRequest request = new CreateUserRequest();
        request.setUsername("daffa");
        request.setPassword("password");
        request.setName("Daffa Naufal Fajriansyah");

        System.out.println(request.getName());

        ValidationUtil.validationReflection(request);

    }
}
