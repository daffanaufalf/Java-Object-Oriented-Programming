class VicePresident extends Manager {
    public static void main(String[] args) {

        var manager = new Manager();
        manager.name = "Daffa";
        manager.sayHello("Gugul");

        var vp = new VicePresident();
        vp.name = "Akmal";
        vp.sayHello("Gugul");

    }
}