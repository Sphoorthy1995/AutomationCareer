import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class EmployeeSalary {
    private String name;
    private int id;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


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

    //method overloading
    public void diplayDetails(boolean detailed){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        if(detailed){
            System.out.println("Salary: " + salary);
        }
    }

    public void incrementSalary(double percentage) {
        salary *= (1 + percentage / 100);
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

        ArrayList<EmployeeSalary> employeeNames=new ArrayList<>();
        employeeNames.add(emp1);
        employeeNames.add(emp2);
        employeeNames.add(emp3);

        HashMap<Integer,EmployeeSalary> employeeId=new HashMap<>();
        employeeId.put(emp1.getId(), emp1);
        employeeId.put(emp2.getId(), emp2);
        employeeId.put(emp3.getId(), emp3);

        Iterator<EmployeeSalary> itr = employeeNames.iterator();
        while (itr.hasNext()){
            EmployeeSalary emp=itr.next();
            emp.displayDetails();

            }

        



        // Display details of all employees
        System.out.println("Basic details");
        System.out.println("Before Increment");
        emp1.displayDetails();
        emp2.displayDetails();
        emp3.displayDetails();

        System.out.println("Boolean detailed");
        emp1.diplayDetails(true);

        System.out.println("After Increment");
        emp1.incrementSalary(5);
        emp2.incrementSalary(3);
        emp3.incrementSalary(7);


    }
}










