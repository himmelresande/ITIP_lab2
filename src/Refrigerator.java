public class Refrigerator extends Appliance {
    private int capacity;

    public Refrigerator(String brand, double powerConsumption, int capacity) {
        super(brand, powerConsumption);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void turnOn() {
        System.out.println("Refrigerator is turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Refrigerator is turned off.");
    }
}
