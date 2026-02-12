package edu.unisabana.pizzafactory.consoleview;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

import edu.unisabana.pizzafactory.factory.PizzaFactory;
import edu.unisabana.pizzafactory.factory.PizzaFactoryLoader;
import edu.unisabana.pizzafactory.model.Amasador;
import edu.unisabana.pizzafactory.model.ExcepcionParametrosInvalidos;
import edu.unisabana.pizzafactory.model.Horneador;
import edu.unisabana.pizzafactory.model.Ingrediente;
import edu.unisabana.pizzafactory.model.Moldeador;
import edu.unisabana.pizzafactory.model.Tamano;

/**
 *
 * @author cesarvefe
 */
public class PreparadorPizza {

    public static void main(String args[]) {
        try {
            Ingrediente[] ingredientes = new Ingrediente[]{
                new Ingrediente("queso", 1),
                new Ingrediente("jamon", 2)
            };

            PreparadorPizza pp = new PreparadorPizza();
            pp.prepararPizza(ingredientes, Tamano.MEDIANO);

        } catch (ExcepcionParametrosInvalidos ex) {
            Logger.getLogger(PreparadorPizza.class.getName())
                    .log(Level.SEVERE, "Problema en la preparacion de la Pizza", ex);
        }
    }

    public void prepararPizza(Ingrediente[] ingredientes, Tamano tam)
            throws ExcepcionParametrosInvalidos {

        // Cargar fábrica desde configuración (pizza.properties)
        PizzaFactory factory = PizzaFactoryLoader.cargarFactory();

        // Crear productos abstractos (sin depender de implementaciones concretas)
        Amasador am = factory.crearAmasador();
        Moldeador mp = factory.crearMoldeador();
        Horneador hpd = factory.crearHorneador();

        // Secuencia NO cambia
        am.amasar();

        if (tam == Tamano.PEQUENO) {
            mp.moldearPizzaPequena();
        } else if (tam == Tamano.MEDIANO) {
            mp.molderarPizzaMediana();
        } else {
            throw new ExcepcionParametrosInvalidos("Tamano de piza invalido:" + tam);
        }

        aplicarIngredientes(ingredientes);
        hpd.hornear();
    }

    private void aplicarIngredientes(Ingrediente[] ingredientes) {
        Logger.getLogger(PreparadorPizza.class.getName())
                .log(Level.INFO, "APLICANDO INGREDIENTES!:{0}", Arrays.toString(ingredientes));

        // CODIGO DE LLAMADO AL MICROCONTROLADOR
    }
}
