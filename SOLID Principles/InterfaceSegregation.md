Modularize interfaces such that class can avoid implementing methods which are not relevant for them 

```
interface RestaurantWorker{
    public void cookFood();
    public void washDishes();
    public void serveFood();
}
```


```
class Waiter implements RestaurantWorker{
    @override
    public void cookFood();
    @override
    public void washDishes();
    @override
    public void serveFood();
}
```

Here for a waiter even though his job is to serve food, we have to implement all other methods as interface is not segregated properly 

One way to address this issue is to segregate our interfaces properly 

```
interface Waiter{
    public void serveFood();
}
```

```
interface Cook{
    public void cookFood();
}
```

```
interface Cleaner{
    public void washDishes();
}
```