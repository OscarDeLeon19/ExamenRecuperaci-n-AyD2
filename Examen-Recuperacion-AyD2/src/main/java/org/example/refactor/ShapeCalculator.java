package org.example.refactor;

import org.example.refactor.shape.CircleShape;
import org.example.refactor.shape.RectangleShape;
import org.example.refactor.shape.ShapeStrategy;
import org.example.refactor.shape.TriangleShape;

/**
 * Clase para manejar la calculadora de figuras
 */
public class ShapeCalculator {

    private final String SHAPE_CIRCLE = "circle";
    private final String SHAPE_RECTANGLE = "rectangle";
    private final String SHAPE_TRIANGLE = "triangle";

    public double calculateArea(String shape, double... dimensions) {
        ShapeStrategy strategy;
        if(shape.equals(SHAPE_CIRCLE)) {
            strategy = new CircleShape();
            return strategy.calculateArea(dimensions);
        } else if(shape.equals(SHAPE_RECTANGLE)) {
            strategy = new RectangleShape();
            return strategy.calculateArea(dimensions);
        } else if(shape.equals(SHAPE_TRIANGLE)) {
            strategy = new TriangleShape();
            return strategy.calculateArea(dimensions);
        } else {
            throw new IllegalArgumentException("Unknown shape: " + shape);
        }
    }
}
