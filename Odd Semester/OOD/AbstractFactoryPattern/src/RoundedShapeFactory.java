public class RoundedShapeFactory extends AbstractFactory{
    @Override
    public Shape getshape(String shape) {
        if(shape.equalsIgnoreCase("Rectangle")){
            return new RoundedRectangle();
        }
        else if(shape.equalsIgnoreCase("Square")){
            return new RoundedSquare();
        }
        return null;
    }
}
