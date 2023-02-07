public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager("Daffa");
        manager.sayHello("Gugul");

        var vp = new VicePresident("Akmal");
        vp.sayHello("Gugul");

        System.out.println(manager);
        System.out.println(manager.toString());

        System.out.println(vp);
        System.out.println(vp.toString());
    }
}