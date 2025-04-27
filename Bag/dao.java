
package com.example.Bag;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author steva
 */
/*
public class dao {

    public void save(model model) {
        String sql = "INSERT INTO trips (destination) VALUES (?)";
        try (Connection conn = database.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, model.getDestination());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<model> findAll() {
        List<model> trips = new ArrayList<>();
        String sql = "SELECT * FROM trips";
        try (Connection conn = database.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                trips.add(new model(rs.getInt("id"), rs.getString("destination")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return trips;
    }
}

*/