At a high level, the LSP states that in an object-oriented program, 
if we substitute a superclass object reference with an object of any of its subclasses, the program should not break.

Subclass should extend the parent class Behavior, not narrow it down 

Example 

```
interface Rider{
    public void turnEngine();
    public void accelerate();
}
```

```
class Bike implements Rider{
    @override
    public void turnEngine(){};
    @override
    public void accelerate(){};
}
```

```
class Bicycle implements Rider{
    @override
    public void turnEngine(){
        throw new AssertionError("Exception cannot start engine for a bicycle");
    }
    @override
    public void accelerate(){};
}
```

The above example voids liskov substitution as we cannot use instance of Bicycle instead of Bike