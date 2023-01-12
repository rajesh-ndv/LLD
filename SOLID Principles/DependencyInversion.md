Class should depend on Interface rather than on Concrete classes

For an example consider we have a macbook class which takes two parameters Keyboard and Mouse 

class MacBook{
    private KeyBoard keyboard;
    private Mouse mouse;
    public MacBook(){
        keyboard = new KeyBoard();
        mouse = new Mouse();
    }
}

The above class is tightly coupled to KeyBoard and Mouse , if in future new classes are added such as Wireless Keyboard and Wireless Mouse 
there is no way to support 

so we use interfaces here instead and inject using constructor 

interface KeyBoard{
    private void type();
}

interface Mouse{
    private void scroll();
    private void leftClick();
    private void rightClick();
}

now new Wireless Keyboard and mouse can implement keyboard and Mouse;

class MacBook{
    private KeyBoard keyboard;
    private Mouse mouse;
    public MacBook(KeyBoard keyboard,Mouse mouse){
        this.keyboard = keyboard;
        this.mouse = mouse;
    }
}