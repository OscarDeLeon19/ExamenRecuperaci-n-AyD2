package org.example.refactor.shape;

public class TriangleShape implements ShapeStrategy{

    @Override
    public double calculateArea(double... dimensions) {

        return dimensions[0] * dimensions[1] / 2;
    }
}
