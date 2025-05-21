package org.example.refactor;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase refactorizda de Final Example
 * Se organizo la clase para tener una unica responsabilidad
 */
public class FinalExampleRefactor {

    public void processData(String input) {
        List<String> data = new ArrayList<>();
        String[] parts = input.split(",");
        for (String part : parts) {
            part = part.trim();
            if (part.length() > 0) {
                if (part.length() > 10) {
                    part = part.substring(0, 10);
                }
                if (part.matches("[a-zA-Z]+")) {
                    data.add(part.toUpperCase());
                }
            }
        }

        System.out.println("Data processed:");
        printData(data); // Creamos un metodo par imprimir

        System.out.println("Total items:");
        System.out.println(data.size()); // Imprimimos el total de Items
    }

    /**
     * Refactorizamos para eliminar código duplicado
     * @param data
     */
    private void printData(List<String> data) {
        for (String item : data) {
            System.out.println("- " + item);
        }
    }
}
