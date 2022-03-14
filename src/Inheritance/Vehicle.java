package Inheritance;

public class Vehicle {

    private final String serialNumber;
    private int noPersons;
    private String name;

    public Vehicle(String serialNumber, int noPersons){
        this.serialNumber = serialNumber;
        this.noPersons = noPersons;
    }

    public Vehicle (String serialNumber, int noPersons, String name) {
        this.serialNumber = serialNumber;
        this.noPersons = noPersons;
        this.name = name;
    }

    public final String getSerialNumber(){
        System.out.println("Car serial number " + serialNumber);
        return serialNumber;
    }

    public boolean goTo(double positionX, double positionY){
        System.out.print("Error: unknown vehicle cannot move...");
        return false;
    }

    public boolean addFuel(double amount){
        System.out.println("Error: unknown vehicle cannot move…");
        return false;
    }

    public void printInfo(){
        System.out.print("Vehicle properties:" + " serial number: " + serialNumber + " ," + " capacity " + noPersons + " , " + "name: " + name);
    }
}
