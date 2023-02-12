package daffanaufal.data;

public record LoginRequest(String username, String password) {
    public LoginRequest {
        System.out.println("Membuat object Login Request");
    }

    public LoginRequest(String username) {
        this(username, "");
    }

    public LoginRequest() {
        this("", "");
    }
}
