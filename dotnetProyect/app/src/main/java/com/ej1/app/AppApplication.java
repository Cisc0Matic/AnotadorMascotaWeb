package com.ej1.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.ej1.app.modelos.Mascota;
import com.ej1.app.servicio.MascotaServicio;

import javax.sql.DataSource;

@SpringBootApplication(scanBasePackages = "com.ej1.app")
public class AppApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(AppApplication.class, args);
        // Obtener AppConfig del contexto de la aplicación y llamar al método de prueba de conexión
        AppConfig appConfig = context.getBean(AppConfig.class);
        DataSource dataSource = context.getBean(DataSource.class);
        AppConfig.testConnection(dataSource);
    }
}
