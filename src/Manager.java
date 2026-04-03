public class Manager extends EmployeeSalary {
    String department;
    Manager(String name, int id, int salary,String department) {
        super(name,id,salary);
        this.department = department;
    }

    public void displayDepartment() {
        System.out.println(department);
    }

    //method overriding
    public void displayDetails() {
        System.out.println("Name: " + getName());
        System.out.println("ID: " + getId());
        System.out.println("Salary: " + getSalary());
        System.out.println("------------------------");
    }

    public static void main(String[] args) {
        Manager mgr1 = new Manager("Spoo", 30, 120000,"IT Analysit");
        Manager mgr2= new Manager("Div", 2508, 110000,"Finance");
        Manager mgr3 = new Manager("DD", 2039, 115000,"Marketing");

        EmployeeSalary emp1 = new EmployeeSalary("Sphoorthy", 25037,120000);
        EmployeeSalary emp2 = new EmployeeSalary("Alice", 25038, 110000);
        EmployeeSalary emp3 = new EmployeeSalary("Bob", 25039, 115000);

        emp1.displayDetails();
        mgr1.displayDetails();
        mgr1.displayDepartment();



    }


}
