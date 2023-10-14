public abstract class Appliance {
    private String brand;
    private double powerConsumption;
    private static int count = 0;
    public Appliance(String brand, double powerConsumption) {
        this.brand = brand;
        this.powerConsumption = powerConsumption;
        count++;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public double getPowerConsumption() {
        return powerConsumption;
    }
    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }
    public abstract void turnOn();
    public abstract void turnOff();
    public static int getCount() {
        return count;
    }
}
