
package com.example.Bag;

import java.util.List;
/**
 *
 * @author steva
 */

public class service {
    private dao dao = new dao();

    public void saveTrip(model model) {
        if (model.getDestination() != null && !model.getDestination().isEmpty()) {
            dao.save(model);
        } else {
            throw new IllegalArgumentException("Destination cannot be empty.");
        }
    }

    public List<model> getAllTrips() {
        return dao.findAll();
    }
}

