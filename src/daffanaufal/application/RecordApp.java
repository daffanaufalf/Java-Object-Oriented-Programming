package daffanaufal.application;

import daffanaufal.data.LoginRequest;

public class RecordApp {
    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest("daffa", "password");

        System.out.println(loginRequest.username());
        System.out.println(loginRequest.password());
        System.out.println(loginRequest);

        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("daffa"));
        System.out.println(new LoginRequest("daffa", "password"));

    }
}
