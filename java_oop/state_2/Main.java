public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("1", "Nanthapat", 30000.0);     // Create Object
        e1.displayEmployee();

        Employee e2 = new Employee("2");
        e2.displayEmployee();

        Employee e3 = new Employee("3", "Suphapit");
        e3.displayEmployee();

        
    }
}