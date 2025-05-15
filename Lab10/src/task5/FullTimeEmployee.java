package task5;

public class FullTimeEmployee extends Employee implements TaxPayer{
    FullTimeEmployee(String name, String id) {
        super(name, id);
    }

    @Override
    public double calculateSalary() {
        return 500000;
    }

    @Override
    public void payTax() {
        System.out.println("Tax has been paid...");
    }
}
