public class PersonApp {
    public static void main(String[] args) {

        var person1 = new Person("Daffa", "Jakarta");

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Akmal");

        Person person2 = new Person("Indra");

        Person person3;
        person3 = new Person();
        person3.name = "Gugul";
        person3.sayHello("Akmal");

    }
}