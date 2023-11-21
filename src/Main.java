public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("Forward");
        Car bmw = new Car("BMW M5");
        Car camry = new Car("Toyota Camry");
        Truck truck = new Truck("Камаз");
        Truck truck2 = new Truck("Маз", 8);

        Transport[] transports = {
                bicycle,
                bmw,
                camry,
                truck,
                truck2,
        };

        ServiceStation serviceStation = new ServiceStation();

        for (Transport transport : transports) {
            serviceStation.check(transport);
            System.out.println("");
        }
    }
}