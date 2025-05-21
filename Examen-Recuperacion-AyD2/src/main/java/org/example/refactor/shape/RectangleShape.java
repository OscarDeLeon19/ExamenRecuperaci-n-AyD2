package org.example.refactor.shape;

public class RectangleShape implements ShapeStrategy {

    @Override
    public double calculateArea(double... dimensions) {

        return dimensions[0] * dimensions[1];

    }
}
