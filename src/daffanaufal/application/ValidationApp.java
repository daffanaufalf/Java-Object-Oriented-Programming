package daffanaufal.application;

import daffanaufal.data.LoginRequest;
import daffanaufal.error.ValidationException;
import daffanaufal.util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest("daffa", "password");

        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data valid");
        } catch (ValidationException | NullPointerException exception) {
            System.out.println("Data tidak valid: " + exception.getMessage());
        } // catch (NullPointerException exception) {
          // System.out.println("Data nul: " + exception.getMessage());
        // }
        finally {
            System.out.println("Selalu di eksekusi");
        }

    }
}
