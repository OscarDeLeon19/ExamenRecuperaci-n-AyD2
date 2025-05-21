package org.example.refactor.shape;

public class CircleShape implements ShapeStrategy {

    @Override
    public double calculateArea(double... dimensions) {

        return Math.PI * dimensions[0] * dimensions[0];
    }
}
