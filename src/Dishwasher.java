public class Dishwasher extends Appliance {
    private int placeSettings;

    public Dishwasher(String brand, double powerConsumption, int placeSettings) {
        super(brand, powerConsumption);
        this.placeSettings = placeSettings;
    }

    public int getPlaceSettings() {
        return placeSettings;
    }

    public void setPlaceSettings(int placeSettings) {
        this.placeSettings = placeSettings;
    }

    @Override
    public void turnOn() {
        System.out.println("Dishwasher is turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Dishwasher is turned off.");
    }
}
