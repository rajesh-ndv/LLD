package src;

import Strategy.*;

public class RaceCar extends Vehicle{

    public RaceCar(){

        super(new FastDriveStrategy());

    }

}