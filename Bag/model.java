
package com.example.Bag;

/**
 *
 * @author steva
 */

public class model {
    private int id;
    private String destination;

    public model(String destination) {
        this.destination = destination;
    }

    public model(int id, String destination) {
        this.id = id;
        this.destination = destination;
    }

    public int getId() {
        return id;
    }

    public String getDestination() {
        return destination;
    }
}

