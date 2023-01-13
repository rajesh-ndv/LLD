The Strategy pattern suggests that you take a class that does something specific in a lot of different ways and extract all of these algorithms into separate classes called strategies.

The original class, called context, must have a field for storing a reference to one of the strategies. The context delegates the work to a linked strategy object instead of executing it on its own.

The context isn’t responsible for selecting an appropriate algorithm for the job. Instead, the client passes the desired strategy to the context. In fact, the context doesn’t know much about strategies. It works with all strategies through the same generic interface, which only exposes a single method for triggering the algorithm encapsulated within the selected strategy.

This way the context becomes independent of concrete strategies, so you can add new algorithms or modify existing ones without changing the code of the context or other strategies.

Consider an example 
```
class Vehicle{
    public void drive(){
        System.out.println("Normal Drive");
    }
}
```

There are some subclasses extending the properties of Vehicle 

```
class RaceCar extends Vehicle{
    @override
    public void drive(){
        System.out.println("Fast Drive");
    }
}

class SportsBike extends vehicle{
    @override
    public void drive(){
        System.out.println("Fast Drive");
    }
}

class Truck extends Vehicle{
    
}
```

From the above example it is seen that RaceCar and SportsBike overrides the normal drive and implements their own drive strategy
Both of their strategies are similar and there is a code duplication involved 

This can be resolved and implemented efficiently using strategy design pattern 

## Refer Code