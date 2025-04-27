package com.example.Bag;



import java.util.List;
/**
 *
 * @author steva
 */


public class controller {
    private final service service = new service();

    public void createTrip(String destination) {
        model model = new model(destination);
        service.saveTrip(model);
    }

    public List<model> getAllTrips() {
        return service.getAllTrips();
    }
}

