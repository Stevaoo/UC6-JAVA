
package com.example.Bag;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.io.InputStream;
import java.io.IOException;

public class database {
    private static Properties props = new Properties();

    static {
        try (InputStream input = database.class.getClassLoader().getResourceAsStream(".env")) {
            if (input == null) {
                throw new IOException("Unable to find .env file.");
            }
            props.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(
            props.getProperty("DB_URL"),
            props.getProperty("DB_USER"),
            props.getProperty("DB_PASSWORD")
        );
    }
}
