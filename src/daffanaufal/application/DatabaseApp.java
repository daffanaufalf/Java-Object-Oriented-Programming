package daffanaufal.application;

import daffanaufal.error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {
        connectDatabase("root", null);
        System.out.println("Sukses");
    }

    public static void connectDatabase(String username, String password) {
        if (username == null || password == null) {
            throw new DatabaseError("Tidak bisa konek ke database");
        }
    }
}
