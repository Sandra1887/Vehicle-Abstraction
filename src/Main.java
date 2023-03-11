import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles;
        vehicles = new ArrayList<>();
        Car porsche = new Car("Porsche", "Cayenne", 220, 2022, 11.0f, 4);
        vehicles.add(porsche);
        Truck volvo = new Truck("Volvo", "FH16", 180, 2019, 33.0f, 3, 2);
        vehicles.add(volvo);
        Motorcycle suzuki = new Motorcycle("Suzuki", "GSX-R1000", 300, 2018, 7.0f, true);
        vehicles.add(suzuki);

        String dist = "Travel distance: 200km";
        String price = "Fuel price: 19.42.sek/l";
        System.out.println(dist + "\n" + price + "\n");


        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.toString() + "\n" + dist + "\n" + price + "\nTotal price: " + vehicle.getPrice() + "sek/l\n");
            }

        if (vehicles.get(0).getPrice() < vehicles.get(1).getPrice() && vehicles.get(0).getPrice() < vehicles.get(2).getPrice()) {
            System.out.println(vehicles.get(0).getBrand() + " is cheapest. The cost is + " + vehicles.get(0).getPrice());
        } else if (vehicles.get(1).getPrice() < vehicles.get(0).getPrice() && vehicles.get(1).getPrice() < vehicles.get(2).getPrice()) {
            System.out.println(vehicles.get(1).getBrand() + " is cheapest. The cost is " + vehicles.get(1).getPrice());
        } else {
            System.out.println(vehicles.get(2).getBrand() + " is cheapest. The cost is " + vehicles.get(2).getPrice() + "sek");
        }
    }
}
