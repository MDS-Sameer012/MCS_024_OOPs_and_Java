/**
 * AbstractClass
 */

 abstract class  Vehicle {
 
    public int numberOfWheels;

   abstract public void start(); 

   public void getVehicleWheels(){
    System.out.println("This Vehicle has "+this.numberOfWheels+" Wheels");
   }
 }

class Car extends Vehicle{

    public Car(){
        numberOfWheels = 4;
    }

    public void start(){
        System.out.println("Car Starts with Key");
    }
}

class RacingCar extends Vehicle{

RacingCar()
{
    numberOfWheels = 4;
}
    @Override
    public void start(){
        System.out.println("Racing car Starts with Button");
    }

    public void refuel(){
        System.out.println("Refueling Racing Car");
    }
}
public class AbstractClass {

    public static void main(String[] args) {
        Car wagnor = new Car();
        wagnor.start();

        RacingCar ferrari = new RacingCar();
        ferrari.start();
        ferrari.refuel();
        ferrari.getVehicleWheels();
    }
}