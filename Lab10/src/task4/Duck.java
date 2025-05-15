package task4;

class Duck implements Flyable,Swimmable{
    @Override
    public void fly() {
        System.out.println("Duck is in the air...");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming...");
    }
}
