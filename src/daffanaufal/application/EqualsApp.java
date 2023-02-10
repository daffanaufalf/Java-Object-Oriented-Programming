package daffanaufal.application;

public class EqualsApp {
    public static void main(String[] args) {

        String first = "Daffa";
        first = first + " " + "Naufal";

        System.out.println(first);

        String second = "Daffa Naufal";
        System.out.println(second);

        System.out.println(first == second); // False
        System.out.println(first.equals(second));

        String third = "Daffa Naufal";

        System.out.println(second == third); // True
        System.out.println(second.equals(third)); // True

    }
}
