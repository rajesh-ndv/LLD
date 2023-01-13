public class Main {
    public static void main(String[] args){
        ShapeFactory shapeFactory = new ShapeFactory();
        shapeFactory.getShape("CIRCLE").draw();
        shapeFactory.getShape("RECTANGLE").draw();
    }
}
