package task2;

class Car implements Vehicle{
    @Override
    public void start() {
        System.out.println("Car is started...");
    }

    public void stop() {
        System.out.println("Car is stopped...");
    }
}
