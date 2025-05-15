package task5;

public abstract class Employee {
    String name;
    String id;

    Employee(String name, String id){
        this.name = name;
        this.id = id;
    }

    public abstract double calculateSalary();
}
