package task3;

public class Rectangle extends Shape implements Printable{
    private double l;
    private double w;

    Rectangle(double l, double w){
        this.l = l;
        this.w = w;
    }

    double getL(){
        return l;
    }

    double getW(){
        return w;
    }

    @Override
    public void print() {
        System.out.println("Printing a rectangle...");
    }

    @Override
    double area() {
        return l*w;
    }
}
