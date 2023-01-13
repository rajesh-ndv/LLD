package src;

import Strategy.*;

public class SportsBike extends Vehicle{

    public SportsBike(){

        super(new FastDriveStrategy());

    }

}