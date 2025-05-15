package task5;

public class Main {
    public static void main(String[] args) {
        PartTimeEmployee pte = new PartTimeEmployee("Darshan", "f24-ari-123", 1000, 8);
        FullTimeEmployee fte = new FullTimeEmployee("Saif Ullah", "f24-ari-131");

        System.out.println("Part Time Employee Salary:" + pte.calculateSalary());
        pte.payTax();
        System.out.println("Full Time Employee Salary:" + fte.calculateSalary());
        fte.payTax();
    }
}
