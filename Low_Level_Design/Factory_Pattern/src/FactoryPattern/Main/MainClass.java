package FactoryPattern.Main;

import FactoryPattern.FactoryShape.ShapeFactory;
import FactoryPattern.Shapes.Shape;

public class MainClass {

    public static void main(String[] args) {
        
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("Triangle");
        shape.draw();
    }

}
