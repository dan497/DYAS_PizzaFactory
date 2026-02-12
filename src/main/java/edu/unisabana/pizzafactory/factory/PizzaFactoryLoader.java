package edu.unisabana.pizzafactory.factory;

import java.io.InputStream;
import java.util.Properties;

public class PizzaFactoryLoader {

    public static PizzaFactory cargarFactory() {
        try {
            Properties p = new Properties();
            InputStream in = PizzaFactoryLoader.class.getClassLoader().getResourceAsStream("pizza.properties");
            if (in == null) {
                throw new RuntimeException("No se encontró pizza.properties en resources");
            }
            p.load(in);

            String clazz = p.getProperty("pizza.factory");
            if (clazz == null || clazz.trim().isEmpty()) {
                throw new RuntimeException("Falta la propiedad pizza.factory en pizza.properties");
            }

            return (PizzaFactory) Class.forName(clazz).getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Error cargando la PizzaFactory desde configuración", e);
        }
    }
}
