//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
AbstractFactory shapeFactory = FactoryProducer.getFactory(false);

Shape shape1 = shapeFactory.getshape("square");
Shape shape2 = shapeFactory.getshape("Rectangle");

AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
Shape shape3 = shapeFactory1.getshape("Rectangle");
Shape shape4 = shapeFactory1.getshape("Square");

shape1.draw();
shape3.draw();

    }
}