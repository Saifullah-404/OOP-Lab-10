package task5;

public class PartTimeEmployee extends Employee implements TaxPayer{
    private int hourRate;
    private int hourWorks;

    PartTimeEmployee(String name, String id, int hourRate, int hourWorks) {
        super(name, id);
        this.hourWorks = hourWorks;
        this.hourRate = hourRate;
    }

    public int getHourRate() {
        return hourRate;
    }

    public int getHourWorks() {
        return hourWorks;
    }

    @Override
    public double calculateSalary() {
        return hourRate*hourWorks;
    }

    @Override
    public void payTax() {
        System.out.println("Tax has been paid...");
    }
}
