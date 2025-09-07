package FactoryPattern.FactoryShape;

import FactoryPattern.Shapes.Rectangle;
import FactoryPattern.Shapes.Shape;
import FactoryPattern.Shapes.Square;
import FactoryPattern.Shapes.Triangle;

public class ShapeFactory {

    public Shape getShape(String str){

        switch(str){

            case "Square": return new Square();

            case "Rectangle" : return new Rectangle();

            case "Triangle" : return new Triangle();


            default : return null;
        }

    }

}
