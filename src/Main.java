public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Bicycle bycicle = new Bicycle("Cudo", 2);
        Car car = new Car("AUDI", 4);
        Truck truck = new Truck("Kamaz", 6);

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.check(bycicle, car, truck);


    }
}