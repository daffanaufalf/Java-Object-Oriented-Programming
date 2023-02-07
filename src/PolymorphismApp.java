public class PolymorphismApp {

    public static void main(String[] args) {

        Employee employee = new Employee("Daffa");
        employee.sayHello("Gugul");

        employee = new Manager("Daffa");
        employee.sayHello("Gugul");

        employee = new VicePresident("Daffa");
        employee.sayHello("Gugul");

        sayHello(new Employee("Daffa"));
        sayHello(new Manager("Akmal"));
        sayHello(new VicePresident("Gugul"));

    }

    static void sayHello(Employee employee) {
        if (employee instanceof VicePresident) {
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP " + vicePresident.name);
        } else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        } else {
            System.out.println("Hello " + employee.name);
        }
    }

}
