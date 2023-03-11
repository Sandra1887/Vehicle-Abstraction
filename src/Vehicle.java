abstract class Vehicle {
     String brand;
     String model;
     int speed;
     int year;
     float fuelConsumption;

    public Vehicle(String brand, String model, int speed, int year, float fuelConsumption) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;
        this.year = year;
        this.fuelConsumption = fuelConsumption;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getSpeed() {
        return speed;
    }
    public int getYear() {
        return year;
    }
    public abstract float getFuelConsumption();

    public abstract float getPrice();
        //return getFuelConsumption() * 19.42f;
    @Override
    public String toString() {
        return brand + " " + model + "\nMax speed: " + speed + "km/h\nYear: " + year + "\nFuel Consumption (l/10mile): " + fuelConsumption;
    }
}
class Car extends Vehicle {
    int doors;
    public Car (String brand, String model, int speed, int year, float fuelConsumption, int doors) {
        super(brand, model, speed, year, fuelConsumption);
        this.doors = doors;
    }

    public int getDoors() {
        return doors;
    }

    @Override
    public float getFuelConsumption(){
        return (fuelConsumption/100) * 200;
    }
    @Override
    public float getPrice() {
        return getFuelConsumption() * 19.42f;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDoors: " + doors;
    }

}
class Motorcycle extends Vehicle {
    boolean windShield;
    public Motorcycle (String brand, String model, int speed, int year, float fuelConsumption, boolean windShield) {
        super(brand, model, speed, year, fuelConsumption);
        this.windShield = windShield;
    }

    public boolean getWindShield() {
        return windShield;
    }
    @Override
    public float getFuelConsumption(){
        return (float) (fuelConsumption/100) * 200;
    }
    @Override
    public float getPrice() {
        return getFuelConsumption() * 19.42f;
    }

    @Override
    public String toString() {
        return super.toString() + "\nHas windshield: " + windShield;
    }
}
class Truck extends Car {
    int capacity;

    public Truck(String brand, String model, int speed, int year, float fuelConsumption, int doors, int capacity) {
        super(brand, model, speed, year, fuelConsumption, doors);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
    @Override
    public float getFuelConsumption(){
        return (fuelConsumption/100) * 200;
    }
    @Override
    public String toString(){
        return super.toString() + "\nCapacity in tons: " + capacity;
    }
}
