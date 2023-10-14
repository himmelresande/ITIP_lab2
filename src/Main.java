public class Main {
    public static void main(String[] args) {
        Refrigerator fridge = new Refrigerator("Samsung", 200, 400);
        Dishwasher dishwasher = new Dishwasher("Bosch", 1500, 8);
        VacuumCleaner vacuumCleaner = new VacuumCleaner("Dyson", 1200, true);

        System.out.println("Total appliances created: " + Appliance.getCount());

        fridge.turnOff();
        dishwasher.turnOn();
        vacuumCleaner.turnOn();

        System.out.println("Refrigerator capacity: " + fridge.getCapacity() + " liters");
        System.out.println("Dishwasher place settings: " + dishwasher.getPlaceSettings());
        System.out.println("Vacuum cleaner is bagless: " + vacuumCleaner.isBagless());

        vacuumCleaner.clean(); // Используем базовую версию clean
        vacuumCleaner.clean(30); // Попробуем убирать в течение 30 минут
        vacuumCleaner.clean("living room"); // Попробуем убирать в гостиной
    }
}
