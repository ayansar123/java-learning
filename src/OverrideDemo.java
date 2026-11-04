abstract class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void setSalary() {
        System.out.println(name + "earns " + salary);
    }

    abstract void showSalary();
}
class Manager extends Employee {
    Manager(String name, double salary) {
        super(name, salary);
    }
    @Override
            void showSalary() {
        System.out.println(name + "(Manager) earns" + (salary + 10000));
    }
}
public class OverrideDemo {
    public static void main(String[] args) {
            Employee e = new Employee("Rahul", 30000) {
                @Override
                void showSalary() {

                }
            };
            Manager m = new Manager("Ayan", 50000);
            e.showSalary();
            m.showSalary();

                }
            }