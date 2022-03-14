package QuizEx;

import java.util.Vector;

public class Vehicle {

    public static String producedBy;
    int productionYear;
    private final int vin;
    String plateNumber;
    static double kilometers;
    int lastSoldOnYear;
    double positionX;
    double positionY;

    public String getPlateNumber(){
        return plateNumber;
    }
    public void setPlateNumber(String plateNumber){
        this.plateNumber = plateNumber;

    }

    public static double getKilometers(){
        return kilometers;
    }

    public Vehicle(int productionYear , int vin, String plateNumber, double kilometers, int lastSoldOnYear) {
        this.productionYear = productionYear;
        this.vin = vin;
        this.plateNumber = plateNumber;
        this.kilometers = kilometers;
        this.lastSoldOnYear = lastSoldOnYear;
    }

    public void sellVehicle(String plateNumber, int lastSoldOnYear) {
        this.plateNumber = plateNumber;
        this.lastSoldOnYear= lastSoldOnYear;
    }


    public boolean isVinValid(boolean isDrivingInAmerica){
        String northAmericaPlateNumber = "1M8GDM9AXKP042788";
        if(plateNumber == northAmericaPlateNumber){
            return true;
        }
        return false;
    }

    public double getPositionX() {
        return positionX;
    }

    public void setPositionX(double positionX) {
       this.positionX = positionX;
    }

    public double getPositionY(){
        return positionY;
    }

    public void setPositionY(double positionY){
        this.positionY = positionY;
    }

    public static void main(String[] args) {
        Vehicle  masinaAndrei = new Vehicle(2007,2323232,"CT77CTO",2302.3,1997);
        masinaAndrei.sellVehicle("CT90BUG", 1998);

    }
}
