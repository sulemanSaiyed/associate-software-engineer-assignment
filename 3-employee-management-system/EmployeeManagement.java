



import java.util.ArrayList;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Salman", 50000));
        employees.add(new Employee(102, "Ayesha", 55000));
        employees.add(new Employee(103, "Rahul", 60000));

        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}
