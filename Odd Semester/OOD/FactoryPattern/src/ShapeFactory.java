public class ShapeFactory {
    public Shape getshape(String shape){
        if(shape.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }
        else if(shape.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        return null;
    }
}
