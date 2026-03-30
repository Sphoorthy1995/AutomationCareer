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

    public void incrementSalary(double percentage){
        salary *=(1+percentage/100);
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
        System.out.println("Before Increment");
        emp1.displayDetails();
        emp2.displayDetails();
        emp3.displayDetails();

        System.out.println("After Increment");
        emp1.incrementSalary(5);
        emp2.incrementSalary(3);
        emp3.incrementSalary(7);


    }
    }


