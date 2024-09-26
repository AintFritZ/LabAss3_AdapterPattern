public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        Refrigerator refrigerator = new Refrigerator();
        SmartphoneCharger charger = new SmartphoneCharger();

        PowerOutlet laptopAdapter = new LaptopAdapter(laptop);
        PowerOutlet refrigeratorAdapter = new RefrigeratorAdapter(refrigerator);
        PowerOutlet smartphoneAdapter = new SmartphoneAdapter(charger);

        laptopAdapter.plugIn();
        refrigeratorAdapter.plugIn();
        smartphoneAdapter.plugIn();
    }
}
