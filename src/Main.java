public class Main{
    public static void main(String[] args){

        Driver driver1 = new Driver("Nurken", "KZ77777");
        Vehicle car = new Car("Toyota", 2018, 4, "Petrol");
        Vehicle motorcycle = new Motorcycle("Suzuki", 2006, false);
        Vehicle truck = new Truck("Volvo", 2023, 30.5, 3);

        Vehicle[] vehicles = {car, motorcycle, truck};
        for (Vehicle v : vehicles) {
            v.startEngine();
            v.displayInfo();
            v.stopEngine();
            driver1.displayDriverInfo();
        }
    }
}
