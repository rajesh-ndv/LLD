public class ShapeFactory {

    public Shape getShape(String curve){
        switch (curve){
            case "CIRCLE":
                return new Circle();
            case "RECTANGLE":
                return new Rectangle();
            default:
                return null;
        }
    }

}
