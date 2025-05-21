package org.example.refactor.shape;

/**
 * Se usara el patron Strategy para manejar los algoritmos de calculos de areas de figuras
 */
public interface ShapeStrategy {

    double calculateArea(double... dimensions);
}
