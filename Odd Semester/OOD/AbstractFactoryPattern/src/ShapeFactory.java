public class ShapeFactory extends AbstractFactory{
    @Override
    public Shape getshape(String shape) {
        if(shape.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        }
        else if(shape.equalsIgnoreCase("Square")){
            return new Square();
        }
        return null;
    }
}
