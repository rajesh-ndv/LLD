package src;

import Strategy.*;

public class Truck extends Vehicle{

    public Truck(){

        super(new NormalDriveStrategy());

    }

}