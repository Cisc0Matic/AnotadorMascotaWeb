package com.ej1.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@Configuration
public class AppConfig {

    @Bean
    public static CommandLineRunner testConnection(DataSource dataSource) {
        return args -> {
            try (Connection connection = dataSource.getConnection()) {
                System.out.println("Conexión a la base de datos exitosa!");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        };
    }
}
