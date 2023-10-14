public class VacuumCleaner extends Appliance {
    private boolean bagless;
    private boolean isCleaning;

    public VacuumCleaner(String brand, double powerConsumption, boolean bagless) {
        super(brand, powerConsumption);
        this.bagless = bagless;
        this.isCleaning = false;
    }

    public boolean isBagless() {
        return bagless;
    }

    public void setBagless(boolean bagless) {
        this.bagless = bagless;
    }

    @Override
    public void turnOn() {
        isCleaning = true;
        System.out.println("Vacuum cleaner is turned on and is now cleaning.");
    }

    @Override
    public void turnOff() {
        isCleaning = false;
        System.out.println("Vacuum cleaner is turned off.");
    }

    // Методы перегрузки
    public void clean() {
        if (isCleaning) {
            System.out.println("Vacuum cleaner is cleaning the room.");
        } else {
            System.out.println("Vacuum cleaner is not turned on. Please turn it on to start cleaning.");
        }
    }

    public void clean(int duration) {
        if (isCleaning) {
            System.out.println("Vacuum cleaner is cleaning the room for " + duration + " minutes.");
        } else {
            System.out.println("Vacuum cleaner is not turned on. Please turn it on to start cleaning.");
        }
    }

    public void clean(String area) {
        if (isCleaning) {
            System.out.println("Vacuum cleaner is cleaning the " + area + ".");
        } else {
            System.out.println("Vacuum cleaner is not turned on. Please turn it on to start cleaning.");
        }
    }

    @Override
    public String toString() {
        return "Vacuum Cleaner: Brand - " + getBrand() + ", Bagless - " + bagless + ", Cleaning - " + isCleaning;
    }
}
