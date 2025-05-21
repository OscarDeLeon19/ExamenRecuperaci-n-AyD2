package org.example.refactor;

import org.example.FinalExample;

import java.util.List;

/**
 * Se extrajo la clase Order para que no sea una subclase
 */
public class Order {
    private String customerName;
    private List<String> items;
    private double total;
    private ReportGenerator generator;

    /**
     * Se creo el constructor para instanciar el generador de reportes y recibir los parametros
     * @param customerName
     * @param items
     * @param total
     */
    public Order(String customerName, List<String> items, double total) {
        this.customerName = customerName;
        this.items = items;
        this.total = total;
        generator = new ReportGenerator();
    }

    public void printOrderSummary() {
        generator.printHeader(customerName);
        for (String item : items) {
            generator.printLineItem(item);
        }
        generator.printTotal(total);
    }
}
