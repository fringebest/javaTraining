package Inheritance;

public class OnRoad extends Vehicle {

    private static int noWheels = 4 ;
    private static int noDoors = 4 ;

    public OnRoad(String serialNumber, int noPersons) {
        super(serialNumber, noPersons);
    }

    public OnRoad(String serialNumber, int noPersons, String name) {
        super(serialNumber, noPersons, name);
    }

    public OnRoad(String serialNumber, int noPersons, String name, int noWheels) {
        super(serialNumber, noPersons, name);
        this.noWheels = noWheels;
    }
    public OnRoad(String serialNumber, int noPersons, String name, int noWheels, int noDoors) {
        super(serialNumber, noPersons, name);
        this.noDoors = noDoors;
        this.noWheels = noWheels;
    }

    @Override
    public boolean goTo(double positionX, double positionY){
        System.out.println("Driving the vehicle on road to coordinates: " + "[" + positionX + ", " + positionY + "]");
        super.goTo(positionX,positionY);
        return true;

    }

    @Override
    public boolean addFuel(double amount){
        System.out.println("Adding " + amount + " l of fuel to driving vehicle");
        super.addFuel(amount);
        return true;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Driving vehicle properties: number of wheels " + noWheels + ", " + "number of doors " + noDoors );
    }


    public static void main(String[] args) {
        OnRoad firstCar = new OnRoad("23232131AZ",2,"Audi", 6,5);
        OnRoad secondCar = new OnRoad("3232332",4,"BMW");

        firstCar.printInfo();
        secondCar.printInfo();

        OnRoad audiCar = new OnRoad("23242434aA",4, "Audi");
        audiCar.printInfo();
        audiCar.getSerialNumber();
        firstCar.goTo(22.3,44.3);

        Vehicle bmwCar = audiCar;
        bmwCar.getSerialNumber();
    }

}
