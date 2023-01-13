package src;
import Strategy.*;
public class Main{
    public static void main(String[] args){
        System.out.println("Main Started");
        Vehicle truck = new Truck();
        truck.drive();
        Vehicle sportsBike = new SportsBike();
        sportsBike.drive();
        Vehicle raceCar = new RaceCar();
        raceCar.drive();
        System.out.println("Main Ends");
    }
}