public class EmployeeSalary {
    String name;
    int id;
    int salary;

    // Constructor to initialize employee details
    public EmployeeSalary(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("------------------------");
    }

    // Main method
    public static void main(String[] args) {

        // Create three EmployeeSalary objects using constructor
        EmployeeSalary emp1 = new EmployeeSalary("Sphoorthy", 25037, 120000);
        EmployeeSalary emp2 = new EmployeeSalary("Alice", 25038, 110000);
        EmployeeSalary emp3 = new EmployeeSalary("Bob", 25039, 115000);

        // Display details of all employees
        emp1.displayDetails();
        emp2.displayDetails();
        emp3.displayDetails();


    }
    }


